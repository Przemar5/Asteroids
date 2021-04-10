package asteroids.entities.dynamic;

import asteroids.Game;
import asteroids.gfx.AssetManager;

import java.awt.image.BufferedImage;

public class Asteroid extends Creature
{
    public Asteroid(Game game, int x, int y, int width, int height, BufferedImage texture, int health)
    {
        super(game, x, y, width, height, texture, 5);
    }

    @Override
    public void update()
    {
        //
    }
}
