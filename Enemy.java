import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    boolean forward=true;
    int speed;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy() {
        speed = Greenfoot.getRandomNumber(3)+1;
    }
    public void act() 
    {
        // Add your action code here.
        if (forward==true) move(speed);
        else
            move(-speed);
        if(getX()>= getWorld().getWidth()-1) 
        forward=false;
        if(getX()<=1) forward=true;
    }    
}
