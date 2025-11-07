import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floor extends Actor
{
    /**
     * Act - do whatever the Floor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Floor(){
        setImage(new GreenfootImage(200,20));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,200,20);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(3,3,194,14);
    }
}
