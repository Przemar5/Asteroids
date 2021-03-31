package asteroids.entities;

import asteroids.Game;
import asteroids.interfaces.Renderable;

import java.awt.*;

public abstract class Entity implements Renderable
{
    public static final int DEFAULT_WIDTH = 32,
                            DEFAULT_HEIGHT = 32;
    protected Game game;
    protected int x, y, width, height;

    public Entity(Game game, int x, int y, int width, int height)
    {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Entity(Game game, int x, int y)
    {
        this.game = game;
        this.x = x;
        this.y = y;
        this.width = Entity.DEFAULT_WIDTH;
        this.height = Entity.DEFAULT_HEIGHT;
    }

    public abstract void render(Graphics g);
}
