import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class field2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class field2 extends Actor
{
    /**
     * Act - do whatever the field2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor demon2;
        // 自分（鬼）と接触しているfiledを取得する
        demon2 = getOneObjectAtOffset(0, 0, demon.class);
        if (demon2 != null){
            // （接触している）鬼があるならば、、、
            // ワールドの箱を作る
            World world;
            // ワールドを取得する
            world = getWorld();
            // ワールドから（接触している）ピザを削除する
            world.removeObject(demon2);
        }
        Actor human2;
        // 自分（鬼）と接触しているfiledを取得する
        human2 = getOneObjectAtOffset(0, 0, human.class);
        if (human2 != null){
            // （接触している）鬼があるならば、、、
            // ワールドの箱を作る
            World world;
            // ワールドを取得する
            world = getWorld();
            // ワールドから（接触している）ピザを削除する
            world.removeObject(human2);
        }  // Add your action code here.
    }    
}
