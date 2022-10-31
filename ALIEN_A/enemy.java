import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends baby
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemy()
    {
        //setRotation(180);
        //shootLaser();
        super();
    }
    
    public enemy(int speed)
    {
        super(speed);
    }
    
    public void act()
    {
        super.act();
        turn(Greenfoot.getRandomNumber(4) + 1);
    }
    
    /*public enemy(int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    
    public int speed = 5;
    public void act()
    {
        move(speed);
        edge();
    }
    
    public void edge()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
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
    
    }*/
}
