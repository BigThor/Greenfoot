import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle  extends Actor
{
    private int puntaje;
    private int vel;
    private String derecha;
    private String izquierda;
    private String nombreJugador;
    
    public Paddle(String nomb , String izq, String der)
    {
        puntaje = 0;
        vel = 4;
        izquierda = izq;
        derecha = der;
        nombreJugador = nomb;
    }
    
    public void act() 
    {
        if( Greenfoot.isKeyDown(izquierda) )
        {
            this.setLocation(this.getX() -vel, this.getY());
        }
        if( Greenfoot.isKeyDown(derecha) )
        {
            this.setLocation(this.getX() +vel, this.getY());
        }
        
        if(puntaje == 5)
        {
            World mundo = this.getWorld();
            mundo.removeObjects(mundo.getObjects(Ball.class) );
            mundo.showText("Gano el jugador " + nombreJugador, 300, 250);
        }
    }
    
    public void incrementarPuntaje()
    {
        puntaje++;
    }
    
    public int regresarPuntaje()
    {
        return puntaje;
    }
}
