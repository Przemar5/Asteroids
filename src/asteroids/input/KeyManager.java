package asteroids.input;

import asteroids.interfaces.Updatable;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class KeyManager implements KeyListener, Updatable
{
    private boolean[] keys, justPressed, cantPress;
    private HashMap<String,Integer> controls;

    public KeyManager()
    {
        keys = new boolean[256];
        justPressed = new boolean[keys.length];
        cantPress = new boolean[keys.length];
    }

    public void addControl(String name, int keyCode)
    {
        controls.put(name, keyCode);
    }

    public void removeControl(String name)
    {
        controls.remove(name);
    }

    public void update()
    {
        for (int i = 0; i < keys.length; i++) {
            if (cantPress[i] && !keys[i]) {
                cantPress[i] = false;
            }
            else if (justPressed[i]) {
                cantPress[i] = true;
                justPressed[i] = false;
            }
            if (!cantPress[i] && keys[i]) {
                justPressed[i] = true;
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        //
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < keys.length)
            keys[keyCode] = true;
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if (keyCode >= 0 && keyCode < keys.length)
            keys[keyCode] = false;
    }

    public boolean isPressed(String name)
    {
        int keyCode = controls.get(name);
        return keys[keyCode];
    }

    public boolean keyJustPressed(int keyCode)
    {
        return justPressed[keyCode];
    }
}
