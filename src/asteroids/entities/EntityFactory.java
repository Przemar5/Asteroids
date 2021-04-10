package asteroids.entities;

import asteroids.Game;
import asteroids.entities.dynamic.Player;
import asteroids.gfx.AssetManager;

import java.awt.image.BufferedImage;

public class EntityFactory
{
    public static Player createPlayer(Game game)
    {
        int width = 40, height = 40;
        int x = (int) ((game.getWidth() - width) / 2);
        int y = (int) ((game.getHeight() - height) / 2);
        BufferedImage texture = AssetManager.getInstance().getAsset("ship");
        return new Player(game, x, y, width, height, texture, 1);
    }
}
