import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns randomly, removes one life from the Player.
 * 
 * @author Drilon Krasniqi KRA
 * @version 1.0
 */
public class Barrel extends Actor
{
    /**
     * @author KRA
     * Execudes methods bellow.
     */
    public void act() 
    {
        outside();
    }
    
    /**
     *  @author KRA
     *  Let's the Barrel move in the given direction.
     */
    public void outside()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        } else{
          setLocation(getX(), getY() + 3);
          if (isTouching(Floor.class) && (getY() < 130))
          {
            setLocation(getX() - 3, getY() - 3);
            turn(-8);
          }
          
          else if(isTouching(Floor.class) && (getY() < 180))
          {
            setLocation(getX() + 3, getY() - 3);
            turn(8);
          }
          
          else if(isTouching(Floor.class) && (getY() < 255))
          {
            setLocation(getX() - 3, getY() - 3);
            turn(-8);
          }
          
          else if(isTouching(Floor.class) && (getY() < 330))
          {
            setLocation(getX() + 3, getY() - 3);
            turn(8);
          }
       }
    }
}
