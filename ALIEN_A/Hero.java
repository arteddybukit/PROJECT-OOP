import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Hero extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //add your action 
        moveHero();
        shootLaser();
        detectbabyCollision();
    }
    
    public void moveHero()
    {
        if (getX() == 599) //bisa juga menggunakan if (isAtEdge())
            setLocation(0, getY());
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() -3);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() +3);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() -3, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() +3, getY());
        }
    }
    
    int laserTimer = 0;
    public void shootLaser()
    {
        if(laserTimer == 30) 
        {
            getWorld().addObject(new Laser(), getX() + 5, getY()); 
            Greenfoot.playSound("laser.wav");
            laserTimer = 0;
        } else{
            laserTimer++;
        }
    
    }
    
    public void detectbabyCollision()
    {
        if (isTouching(baby.class))
        {
            setLocation(92, 199);
        }
    }
}