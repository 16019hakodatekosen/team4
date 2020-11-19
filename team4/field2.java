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
        Actor actor3 = getOneIntersectingObject( demon.class );
        if( actor3 != null ){
            // TARO とぶつかった時の処理を書く
            // ピザ Actor の箱を作る
Actor demon;
// 自分（鬼）と接触しているfiledを取得する
demon = getOneObjectAtOffset(0, 0, demon.class);
if (demon != null){
// （接触している）鬼があるならば、、、

// ワールドの箱を作る
World world;
// ワールドを取得する
world = getWorld();
// ワールドから（接触している）ピザを削除する
world.removeObject(demon);
}
        }
        Actor actor4 = getOneIntersectingObject( human.class );
        
        if( actor4 != null ){
            // TARO とぶつかった時の処理を書く
            Actor human;
// 自分（鬼）と接触しているfiledを取得する
human = getOneObjectAtOffset(0, 0, human.class);
if (human != null){
// （接触している）鬼があるならば、、、

// ワールドの箱を作る
World world;
// ワールドを取得する
world = getWorld();
// ワールドから（接触している）ピザを削除する
world.removeObject(human);
}
        }  
        // Add your action code here.
    }    
}
