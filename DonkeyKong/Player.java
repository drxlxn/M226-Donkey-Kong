import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player moves and tries to reach the end. Can die from barrels.
 * 
 * @author Drilon Krasniqi KRA
 * @version 1.1
 */
public class Player extends Actor
{
    int Lives = 3;
    
    
    /**
     * @author KRA
     * Execudes methods bellow.
     */
    public void act() 
    {
        motion();
        touchBarrel();
        checkLife();
        moveUp();
    }

    /**
     * @author KRA
     * This method let's the player move.
     */
    private void motion() 
    {
                
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+2);
        }

        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-3, getY());
        }

        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3, getY());
        }

    }
    
    /**
     * @author KRA
     * Method touchBarrel checks if the Player has been hit by a barrel or not.
     */
    public void touchBarrel()
    {
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            Lives = Lives - 1;
        }
    }
    
    /**
     * @author KRA
     * This method checks if the life count has reached zero.
     */
    public void checkLife()
    {
        if(Lives == 0)
        {
            getWorld().showText("GAME OVER", 750, 600);
            Greenfoot.stop();
        }
    }
    
    /**
     * @author KRA
     * moveUp is here to restrict the player from not going up the play field if not needed to.
     */
    public void moveUp()
    {
        if(isTouching(ladder.class))
        {
            if(Greenfoot.isKeyDown("up"))
            {
            setLocation(getX(), getY()-1);
            }
        }
    
    }
}
    
