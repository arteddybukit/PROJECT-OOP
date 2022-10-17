import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero =  new  Hero();
        addObject(hero, 92, 199);
    }
    
    public void act()
    {
        spawnbaby();
    }
    
    public int timerbaby = 0;
    public void spawnbaby()
    {
        if (timerbaby == 180)
        {
            int speed = Greenfoot.getRandomNumber(4) + 1;
            addObject(new baby(speed), 599, Greenfoot.getRandomNumber(400));
            timerbaby = 0;
        } 
        else 
        {
             timerbaby++;   
        }
    }
}
