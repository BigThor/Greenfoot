import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PongWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongWorld  extends World
{

    /**
     * Constructor for objects of class PongWorld.
     * 
     */
    public PongWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(700, 500, 1);
        Paddle p1 = new Paddle("P1", "a", "s");
        Paddle p2 = new Paddle("P2", "left", "right");
        
        addObject(p1, 350, 30);
        addObject(p2, 350, 470);
        addObject(new Ball(), 350, 250);
        
        this.showText("P1:", 30, 20);
        this.showText("P2:", 30, 480);
    }
}
