import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class field1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class field1 extends Actor
{
    /**
     * Act - do whatever the field1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor actor = getOneIntersectingObject( demon.class );
        if( actor != null ){
            // 鬼とぶつかった時の処理を書く
        }
        Actor actor = getOneIntersectingObject( human.class );
        if( actor != null ){
            // 人 とぶつかった時の処理を書く
        }  // Add your action code here.
    }    
}
