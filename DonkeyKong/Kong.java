import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy of Player, spawns barrels.
 * 
 * @author Drilon Kransiqi KRA
 * @version 1.01
 */
public class Kong extends Actor
{
    /**
     * @author KRA
     * Execudes methods bellow.
     */
    public void act() 
    {
        spawnBarrel();
    }
       
   /**
     * @author KRA
     * Spawns a barrels in a random pace.
     */
    public void spawnBarrel()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            getWorld().addObject(new Barrel(), getX()-100, getY());
        }
    }
}
