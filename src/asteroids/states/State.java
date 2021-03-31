package asteroids.states;

import asteroids.Game;
import asteroids.interfaces.Renderable;
import asteroids.interfaces.Updatable;

import java.awt.*;

public abstract class State implements Renderable, Updatable
{
    protected Game game;

    public State(Game game)
    {
        this.game = game;
    }

    public abstract void render(Graphics g);

    public abstract void update();
}
