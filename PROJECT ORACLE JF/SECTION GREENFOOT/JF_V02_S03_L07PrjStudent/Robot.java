import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Robot extends Actor
{

    /**
     * Act - do whatever the Robot wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    
    public void robotMovement()
    {
        move (3);
        {
            if(Greenfoot.isKeyDown("left"))
            {
                turn (-2);
            } else if(Greenfoot.isKeyDown("right"))
            {
                turn (2);
            } else if(Greenfoot.isKeyDown("up"))
            {
                turn (-2);
            } else if(Greenfoot.isKeyDown("down"))
            {
                turn (2);
            }
        }
    }
    
    public void detectWallCollision()
    {
        if(isTouching(Wall.class))
        {
            setLocation(48, 50);
            removeTouching(Wall.class);
            Greenfoot.playSound("hurt.wav");
        }
    }
    
    public void detectBlockCollision()
    {
        if(isTouching(Block.class))
        {
            setLocation(48, 50);
            removeTouching(Block.class);
            Greenfoot.playSound("hurt.wav");
        }
    }
    
    public void detectHome()
    {
        if(isTouching(Home.class))
        {
            setLocation(48, 50);
            removeTouching(Home.class);
            Greenfoot.playSound("yipee.wav");
        }
    }
    
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
        }
    }
}
