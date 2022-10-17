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
            animate();
        }
    }
    
    public void detectWallCollision()
    {
        if(isTouching(Wall.class))
        {
            setLocation(48, 50);
            removeTouching(Wall.class);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectBlockCollision()
    {
        if(isTouching(Block.class))
        {
            setLocation(48, 50);
            removeTouching(Block.class);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectHome()
    {
        if(isTouching(Home.class))
        {
            setLocation(48, 50);
            removeTouching(Home.class);
            Greenfoot.playSound("yipee.wav");
            if(pizzaEaten == 5)
            {
                Greenfoot.stop();
                pizzaEaten = 0;
            }
        }
    }
    
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    
    public Robot()
    {
        robotimage1 = new GreenfootImage("man01.png");
        robotimage2 = new GreenfootImage("man02.png");
        gameoverimage = new GreenfootImage("gameover.png");
        lives = 3;
        pizzaEaten = 0;
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
}
