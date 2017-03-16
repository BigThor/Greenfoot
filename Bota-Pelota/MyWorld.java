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
        Pelota pelota = new Pelota();
        addObject(pelota,259,116);
        Disparo disparo = new Disparo();
        addObject(disparo,148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        disparo.setLocation(148,140);
        removeObject(disparo);
        Jugador jugador = new Jugador();
        addObject(jugador,290,349);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,384,57);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,87,55);
        pelota3.setLocation(52,371);
        pelota2.setLocation(506,90);
        pelota2.setLocation(530,77);
    }
}
