import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hati here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demon extends Actor
{
    /**
     * Act - do whatever the hati wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // mouse dragging
if (Greenfoot.mouseDragged(this))
{
    MouseInfo mouse = Greenfoot.getMouseInfo();
    setLocation(mouse.getX(), mouse.getY());
}
// locking onto selection (or not)

    }    
}
