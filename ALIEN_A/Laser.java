import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(8);
        laserCollision();
        
    }
    
    public void laserCollision()
    {
        if (isTouching(baby.class))
        {
            getWorld().addObject(new Boom(), getX(), getY());
            
            removeTouching(baby.class);
            getWorld().removeObject(this);
            Greenfoot.playSound("laser.wav");
        } 
        else  if (isAtEdge())
        {
            getWorld().removeObject(this);   
        }
    }
}
