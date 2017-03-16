import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    private int mov = 7;
    
    public void act() 
    {
        this.setLocation(this.getX(), this.getY() - mov);
        if(this.getY() == 0)
        {
            (this.getWorld()).removeObject(this);
        }
    }
    
    public boolean existir()
    {
        if(this.getWorld() == null) 
            return false;
        else
            return true;
    }
}
