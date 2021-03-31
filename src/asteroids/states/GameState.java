package asteroids.states;

import asteroids.Game;
import asteroids.levels.Level;

import java.awt.*;

public class GameState extends State
{
    private Level level;

    public GameState(Game game, Level level)
    {
        super(game);
        this.level = level;
    }

    @Override
    public void render(Graphics g)
    {
        //
    }

    @Override
    public void update()
    {
        //
    }
}
