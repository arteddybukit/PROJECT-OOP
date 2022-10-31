import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby here.
 * 
 * @author (arteddy) 
 * @version (a version number or a date)
 */
public class baby extends Hero
{
    /**
     * Act - do whatever the baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public baby()
    {
        setRotation(180);
    }
    
    public baby(int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    
    private int speed = 5;
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
}
