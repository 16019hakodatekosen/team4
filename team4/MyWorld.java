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
    static public int score=0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new kiri(), 300, 80 );
        addObject( new field1(), 100, 300 );
        addObject( new field2(), 500, 300 );
        score =0;
     }
     public void act() 
    {
     showText("score="+score, 100, 50 );
    }
}
