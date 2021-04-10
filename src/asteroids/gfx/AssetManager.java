package asteroids.gfx;

import java.awt.image.BufferedImage;
import java.util.HashMap;

public class AssetManager
{
    private static final int DEFAULT_WIDTH = 80, DEFAULT_HEIGHT = 80;
    private static AssetManager instance = null;
    private BufferedImage sheet;
    private HashMap<String,BufferedImage> assets = new HashMap<String,BufferedImage>();

    private AssetManager()
    {
        sheet = ImageLoader.load("/textures/sheet.png");
        addAsset("ship", crop(sheet, 0, 0, DEFAULT_WIDTH, DEFAULT_HEIGHT));
        addAsset("asteroid", crop(sheet, DEFAULT_WIDTH, 0, DEFAULT_WIDTH, DEFAULT_HEIGHT));
        addAsset("missile", crop(sheet, DEFAULT_WIDTH*2, 0, DEFAULT_WIDTH, DEFAULT_HEIGHT));
    }

    public static AssetManager getInstance()
    {
        if (instance == null)
            instance = new AssetManager();

        return instance;
    }

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
