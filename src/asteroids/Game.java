package asteroids;

import asteroids.display.Display;
import asteroids.states.GameState;
import asteroids.states.MenuState;
import asteroids.states.State;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable
{
    private String title;
    private int width, height;
    private Display display;
    private Graphics g;
    private BufferStrategy bs;
    private Thread thread;
    private boolean running = false;
    private int fps = 60;
    private GameState gameState;
    private MenuState menuState;
    private State currentState;

    public Game(String title, int width, int height)
    {
        this.title = title;
        this.width = width;
        this.height = height;
        gameState = new GameState(this);
        menuState = new MenuState(this);
        currentState = gameState;
    }

    @Override
    public void run()
    {
        init();

        double tickTime = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / tickTime;
            timer += now - lastTime;
            lastTime = now;

            if (delta >= 1) {
                update();
                render();
                ticks++;
                delta--;
            }

            if (timer >= 1000000000) {
                System.out.println("Ticks and Frames: " + ticks);
                ticks = 0;
                timer = 0;
            }
        }
        stop();
    }

    private void init()
    {
        display = new Display(title, width, height);
    }

    private void update()
    {
        currentState.update();
    }

    private void render()
    {
        bs = display.getCanvas().getBufferStrategy();

        if (bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        g.fillRect(0, 0, width, height);

        if (currentState != null)
            currentState.render(g);
        
        bs.show();
        g.dispose();
    }

    public synchronized void start()
    {
        if (running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop()
    {
        if (!running)
            return;

        running = false;

        try {
            thread.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }
}
