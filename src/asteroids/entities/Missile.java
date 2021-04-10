package asteroids.entities;

import asteroids.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Missile extends Entity
{
    public Missile(Game game, int x, int y, int width, int height, BufferedImage texture)
    {
       super(game, x, y, width, height, texture);
    }

    @Override
    public void render(Graphics g)
    {
        //
    }

    public void update()
    {
        //
    }
}
