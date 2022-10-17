import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Block extends Actor
{
    private int turnspeed;
    /**
     * Act - do whatever the Block wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(turnspeed);
    }
    
    public Block(int maxturnspeed)
    {
        turnspeed = (Greenfoot.getRandomNumber(maxturnspeed) + maxturnspeed);
        if (turnspeed == 0) 
        {
            turnspeed++;
        }
    }
}
