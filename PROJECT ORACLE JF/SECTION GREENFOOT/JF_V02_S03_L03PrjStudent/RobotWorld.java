import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * arteddy rover bukit
 * 2115101052
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public RobotWorld()
    {
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot =  new  Robot();
        addObject(robot, 297, 371);
        removeObject(robot);
    }
}
