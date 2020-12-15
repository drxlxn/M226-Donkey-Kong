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

        Kong kong = new Kong();
        addObject(kong,40,36);
        ladder ladder = new ladder();
        addObject(ladder,540,369);
        Floor floor = new Floor();
        addObject(floor,414,333);
        Floor floor2 = new Floor();
        addObject(floor2,187,333);
        ladder ladder2 = new ladder();
        addObject(ladder2,105,299);
        ladder.setLocation(543,351);
        Floor floor3 = new Floor();
        addObject(floor3,187,265);
        Floor floor4 = new Floor();
        addObject(floor4,413,265);
        ladder ladder3 = new ladder();
        addObject(ladder3,514,232);
        ladder3.setLocation(464,233);
        Floor floor5 = new Floor();
        addObject(floor5,414,198);
        Floor floor6 = new Floor();
        addObject(floor6,132,198);
        floor6.setLocation(153,198);
        floor6.setLocation(171,198);
        floor6.setLocation(140,199);
        ladder ladder4 = new ladder();
        addObject(ladder4,133,166);
        Floor floor7 = new Floor();
        addObject(floor7,185,133);
        Floor floor8 = new Floor();
        addObject(floor8,412,131);
        floor8.setLocation(422,133);
        ladder ladder5 = new ladder();
        addObject(ladder5,462,101);
        Floor floor9 = new Floor();
        addObject(floor9,415,66);
        Floor floor10 = new Floor();
        addObject(floor10,184,65);
        floor10.setLocation(182,65);
        floor10.setLocation(143,66);
        kong.setLocation(38,56);
        kong.setLocation(38,40);
        Player player = new Player();
        addObject(player,37,369);
        ladder.setLocation(548,387);
        ladder.setLocation(504,366);
        kong.setLocation(61,17);
        kong.setLocation(111,19);
        removeObject(kong);
        addObject(kong,42,32);
        player.setLocation(52,357);
        player.setLocation(43,365);
        player.setLocation(28,371);
        floor5.setLocation(364,198);
        floor5.setLocation(441,199);
    }
}
