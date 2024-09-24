// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor that sets aspect ratio of the world and prints out a string.
     */
    public GameWonWorld()
    {
        super(600, 400, 1);
        showTextWithBigWhiteFont("You Win!", 200, 200);
    }

    /**
     * The method which customizes the you win message.
     */
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
