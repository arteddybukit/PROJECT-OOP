import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private int lives;
    private int pizzaEaten;
    private GreenfootImage gameoverimage;
    private int score;
    private int timer;
    private final int MAXTIMER = 1000;
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
        updateTimer();
    }
    
    public void robotMovement()
    {
        {
            if (Greenfoot.isKeyDown("up"))
            {
                setLocation(getX(), getY() -3);
                animate();
            }
            if (Greenfoot.isKeyDown("down"))
            {
                setLocation(getX(), getY() +3);
                animate();
            }
            if (Greenfoot.isKeyDown("left"))
            {
                setLocation(getX() -3, getY());
                animate();
            }
            if (Greenfoot.isKeyDown("right"))
            {
                setLocation(getX() +3, getY());
                animate();
            }
        }
    }
    
    public void detectWallCollision()
    {
        if(isTouching(Wall.class))
        {
            resetPosition();
            removeTouching(Wall.class);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectBlockCollision()
    {
        if(isTouching(Block.class))
        {
            resetPosition();
            removeTouching(Block.class);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectHome()
    {
        if(isTouching(Home.class))
        {
            resetPosition();
            removeTouching(Home.class);
            Greenfoot.playSound("yipee.wav");
            if(pizzaEaten == 5)
            {
                Greenfoot.stop();
                pizzaEaten = 0;
            }
            RobotWorld myworld = (RobotWorld)getWorld();
            myworld.increaseLevel();
            increaseScore();
            resetTimer();
        }
    }
    
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
            timer = timer + 200;
        }
    }
    
    public Robot()
    {
        robotimage1 = new GreenfootImage("man01.png");
        robotimage2 = new GreenfootImage("man02.png");
        gameoverimage = new GreenfootImage("gameover.png");
        lives = 3;
        pizzaEaten = 0;
        timer = MAXTIMER;
    }
    
    public void animate()
    {
        if(getImage() == robotimage1)
        {
            setImage(robotimage2);
        } else
        {
            setImage(robotimage1);
        }
    }
    
    public void removeLife()
    {
        lives--;
        showStatus();
        testEndGame();
    }
    
    public void testEndGame()
    {
        if (lives <= 0)
        {
            Greenfoot.stop();
            setImage(gameoverimage);
        }
    }
    
    public void increaseScore()
    {
        score++;
        showStatus();
    }
    
    public void showStatus()
    {
         getWorld().showText("score : " + score, 71, 530);
         getWorld().showText("lives : " + lives, 71, 560);
    }
    
    public void updateTimer()
    {
        timer--;
        getWorld().showText("timer : " + timer, 48, 10);
        if(timer == 0)
        {
            removeLife();
            resetTimer();
        }
    }
    
    public void resetPosition()
    {
        setLocation(48, 50);
    }
    
    public void resetTimer()
    {
        timer = MAXTIMER;
    }
    
}
