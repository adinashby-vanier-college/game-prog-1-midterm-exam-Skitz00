// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * 
     */
    public Snake()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * When Run or Act is pressed these methods will be ready.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameLost()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * The moving method for the snake.
     */
    public void moveAround()
    {
        move(3);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * The eating method for the snake
     */
    public void eat()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
        }
    }

    /**
     * Let's the world know if there is a pig left.
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Sets the world to the GameOverWorld and plays a sound.
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
        Greenfoot.playSound("lose.wav");
    }
}
