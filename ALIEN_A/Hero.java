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
    
    private void moveHero()
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
        
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() -3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() +3);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() -3, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() +3, getY());
        }
    }
    
    private int laserTimer = 0;
    private void shootLaser()
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
            removeTouching(baby.class);
            getWorld().addObject(new Boom(), getX(), getY());
            setLocation(92, 199);
       }
    }
    
    
}