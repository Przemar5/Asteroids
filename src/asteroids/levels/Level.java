package asteroids.levels;

import asteroids.Game;
import asteroids.interfaces.Renderable;
import asteroids.interfaces.Updatable;

import java.awt.*;

public class Level implements Renderable, Updatable
{
    private Game game;

    public Level(Game game)
    {
        this.game = game;
    }

    @Override
    public void render(Graphics g)
    {
        clearScreen(g);
    }

    private void clearScreen(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, game.getWidth(), game.getHeight());
    }

    @Override
    public void update()
    {
        //
    }
}
