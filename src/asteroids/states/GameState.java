package asteroids.states;

import asteroids.Game;
import asteroids.entities.Missile;
import asteroids.entities.dynamic.Asteroid;
import asteroids.entities.dynamic.Player;
import asteroids.levels.Level;

import java.awt.*;
import java.util.ArrayList;

public class GameState extends State
{
    private Level level;
    private Player player;
    private ArrayList<Asteroid> asteroids = new ArrayList<Asteroid>();
    private ArrayList<Missile> missiles = new ArrayList<Missile>();

    public GameState(Game game)
    {
        super(game);
    }

    @Override
    public void render(Graphics g)
    {
        player.render(g);
    }

    @Override
    public void update()
    {
        //
    }
}
