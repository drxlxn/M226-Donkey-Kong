import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Floor Floor = new Floor();
        addObject(Floor,434,97);

        Floor Floor2 = new Floor();
        addObject(Floor2,246,97);

        Floor Floor3 = new Floor();
        addObject(Floor3,183,174);

        Floor Floor4 = new Floor();
        addObject(Floor4,350,174);

        Floor Floor5 = new Floor();
        addObject(Floor5,246,250);

        Floor Floor6= new Floor();
        addObject(Floor6,434,250);

        Floor Floor7 = new Floor();
        addObject(Floor7,183,325);

        Floor Floor8 = new Floor();
        addObject(Floor8,350,325);

        Player player = new Player();
        addObject(player,41,363);

        ladder ladder = new ladder();
        addObject(ladder,458,364);

        ladder ladder2 = new ladder();
        addObject(ladder2,98,289);

        ladder ladder3 = new ladder();
        addObject(ladder3,476,213);

        ladder ladder4 = new ladder();
        addObject(ladder4,131,136);
        
        Kong kong = new Kong();
        addObject(kong,548,51);
    }
    
    /*public void win()
    {
        Player Player = getObjects(Player.class);
        if (Player.getX() == 7)
        {
            showText("YOU WIN", 750, 600);
            
            }
    }*/
} 
