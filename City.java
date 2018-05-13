import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class City here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class City extends World
{

    /**
     * Constructor for objects of class City.
     * 
     */
    public City()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Exit(), 30, 47);      
        addObject(new Enemy(), 100, 75);      
        addObject(new Enemy(), 50, 155);
        addObject(new Enemy(), 50, 255);
        addObject(new Hero(), 550, 350);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy = new Enemy();
        addObject(enemy,296,187);
        Block block = new Block();
        addObject(block,426,329);
        Block block2 = new Block();
        addObject(block2,292,339);
        Block block3 = new Block();
        addObject(block3,130,331);
    }
}
