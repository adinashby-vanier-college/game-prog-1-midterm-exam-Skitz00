// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Sets the aspect ratio of the world and makes the prepare method ready when the game is run.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * When the game is reset the world is set to this. Actors are placed on specific points.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 521, 60);
        Burger burger2 =  new  Burger();
        addObject(burger2, 75, 64);
        Burger burger3 =  new  Burger();
        addObject(burger3, 515, 323);
        Burger burger4 =  new  Burger();
        addObject(burger4, 79, 343);
        Pig pig =  new  Pig();
        addObject(pig, 312, 200);
        burger3.setLocation(268, 61);
        Snake snake =  new  Snake();
        addObject(snake, 515, 350);
        burger3.setLocation(97, 218);
        burger2.setLocation(401, 77);
        burger3.setLocation(59, 32);
        pig.setLocation(297, 209);
        burger.setLocation(492, 264);
        burger2.setLocation(420, 43);
        burger.setLocation(572, 278);
        burger2.setLocation(529, 25);
    }
}
