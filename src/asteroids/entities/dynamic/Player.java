package asteroids.entities.dynamic;

import asteroids.Game;
import asteroids.gfx.AssetManager;

import java.awt.image.BufferedImage;

public class Player extends Creature
{
    public Player(Game game, int x, int y, int width, int height, BufferedImage texture, int health)
    {
        super(game, x, y, width, height, texture, health);
    }

    @Override
    public void update()
    {
        //
    }
}
