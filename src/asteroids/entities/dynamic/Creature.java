package asteroids.entities.dynamic;

import asteroids.Game;
import asteroids.entities.Entity;
import asteroids.interfaces.Updatable;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Creature extends Entity implements Updatable
{
    protected int health;
    protected int velX, velY;
    protected float angle = 0;
    protected float radialSpeed = 0;
    protected BufferedImage texture;

    public Creature(Game game, int x, int y, int width, int height, int health)
    {
        super(game, x, y, width, height);
        this.health = health;
    }

    public void render(Graphics g)
    {
        Graphics2D gfx = (Graphics2D) g;
        gfx.rotate(Math.toRadians(angle), width/2, height/2);
        gfx.drawImage(texture, null, 0, 0);
        gfx.dispose();
    }

    public abstract void update();
}
