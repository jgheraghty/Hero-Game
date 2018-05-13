import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private int prevX;
    private int prevY;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        prevX=getX();
        prevY=getY();
        if(Greenfoot.isKeyDown("left")) setLocation(getX() -1, getY());
        if(Greenfoot.isKeyDown("right")) setLocation(getX() +1, getY());
        if(Greenfoot.isKeyDown("up")) setLocation(getX() , getY()-1);
        if(Greenfoot.isKeyDown("down")) setLocation(getX(), getY()+1);
        if(isTouching(Enemy.class)) setLocation(550, 350);
        if(isTouching(Block.class)) setLocation(prevX, prevY);
        //if(isTouching(Exit.class)) topped();
    }    
}
