import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    private int mov;
    private boolean disparando;
    private Disparo disparo;
    
    public Jugador()
    {
        mov = 4;
        disparando = false;
        disparo = new Disparo();
    }
    
    @Override
    public void act() 
    {
        if (Greenfoot.isKeyDown("right") )
        {
            this.setLocation(this.getX() +mov, this.getY() );
        }
        
        if (Greenfoot.isKeyDown("left") )
        {
            this.setLocation(this.getX() -mov, this.getY() );
        }
        
        if (Greenfoot.isKeyDown("up") )
        {
            this.setLocation(this.getX(), this.getY() -mov);
        }
        
        if (Greenfoot.isKeyDown("down") )
        {
            this.setLocation(this.getX() - 1, this.getY() +mov);
        }
        
        if (Greenfoot.isKeyDown("space") && !disparando)
        {
            (this.getWorld()).addObject(disparo, this.getX(), this.getY() -30);
        }
        
        disparando = disparo.existir();
        
        /*  Otra forma de resolverlo
         * 
         * //Revisar cuantos disparos hay en el mundo
         * World mundo = this.getWorld();
         * List lista = mundo.getObjects(Disparo.class);
         * if(lista.isEmpty())
         *      disparando = false;
         * else
         *      disparando = true;
         */
    }    
}
