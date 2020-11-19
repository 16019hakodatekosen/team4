import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class taro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class taro extends Actor
{
    /**
     * Act - do whatever the taro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(1);
    }

        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
}
<<<<<<< HEAD

        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
}
 if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(360);
=======
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
}// Add your action code here.

        if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
>>>>>>> 04c1a159eff00b343e06e4e92373fc38d3171398
        move(1);
    }
    }   
    
}
}}


   
