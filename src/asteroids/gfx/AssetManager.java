package asteroids.gfx;

import java.awt.image.BufferedImage;
import java.util.HashMap;

public class AssetManager
{
    private HashMap<String,BufferedImage> assets;

    public BufferedImage crop(BufferedImage sheet, int x, int y, int width, int height)
    {
        return sheet.getSubimage(x, y, width, height);
    }

    public void addAsset(String name, BufferedImage img)
    {
        assets.put(name, img);
    }

    public BufferedImage getAsset(String name)
    {
        return assets.get(name);
    }
}
