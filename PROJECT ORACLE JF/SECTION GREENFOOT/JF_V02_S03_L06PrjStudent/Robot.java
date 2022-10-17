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
        detectWallCollision();
        detectBlockCollision();
    }
    
    public void robotMovement()
    {
        turn(4);
    }
    
    public void detectWallCollision()
    {
        if(isTouching(Wall.class))
        {
            setLocation(48, 50);
        }
    }
    
    public void detectBlockCollision()
    {
        if(isTouching(Block.class))
        {
            setLocation(48, 50);
        }
    }
}
