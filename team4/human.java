import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 最強 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class human extends Actor
{
    /**
     * Act - do whatever the 最強 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseDragged(this))
        {
    MouseInfo mouse = Greenfoot.getMouseInfo();
    setLocation(mouse.getX(), mouse.getY());
}
// locking onto selection (or not)

    }    
}
