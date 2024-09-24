// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * When Run or Act is pressed these methods will be ready.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * The moving and turning method for the pig.
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-4);
        }
    }

    /**
     * The eating method for the pig.
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * Let's the world know if there are burgers left on the world.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Changes the world to the GameWonWorld and plays a sound.
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("win.wav");
    }
}
