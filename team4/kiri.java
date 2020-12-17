import greenfoot.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class kiri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kiri extends Actor
{
    
    /**
     * Act - do whatever the kiri wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long lastAdded = System.currentTimeMillis();
    
    
    public void act() 
    {
        long curTime  = System.currentTimeMillis();
    if (curTime >= lastAdded + 1000) //5000ms = 5s
    {
        double a = Math.random();
        
        if ( a < 0.5)
        {
            getWorld().addObject( new demon(), 300, 80 );
        }
    
        else
        {
            getWorld().addObject( new human(), 300, 80 );
        }
        lastAdded  = curTime;
    }
        
        
    }    
}
