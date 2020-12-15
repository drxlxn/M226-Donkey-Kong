import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        motion();
    }

    /**
     * This method let's the player move.
     */
    private void motion() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-4);
        }

        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }

        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }

        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
        }

    }
}
    
