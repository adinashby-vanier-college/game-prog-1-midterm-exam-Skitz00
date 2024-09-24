// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverWorld extends World
{

    /**
     * Constructor that sets aspect ratio of the world and prints out a string.
     */
    public GameOverWorld()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont("Game Over!", 200, 200);
    }

    /**
     * The method which customizes the game over message.
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
