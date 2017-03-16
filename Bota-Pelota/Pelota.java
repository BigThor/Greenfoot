import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    private int incx;
    private int incy;
    
    public Pelota()
    {
        incx = 5;
        incy = 5;
    }
    
    @Override
    public void act() 
    {
        this.setLocation(this.getX() + incx, this.getY() + incy);
        
        if(this.getX() < 10 || (this.getWorld() ).getWidth() < this.getX() +10)
        {
            incx = -incx;
        }
        
        if(this.getY() < 10 || (this.getWorld() ).getHeight() < this.getY() +10 )
        {
            incy = -incy;
        }
        
        this.morir();
    }
    
    public void morir()
    {
        if(this.isTouching(Disparo.class))
        {
            removeTouching(Disparo.class);
            (this.getWorld()).removeObject(this);
        }
    }
}
