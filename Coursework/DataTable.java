import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DataTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataTable extends Actor
{
    /**
     * Act - do whatever the DataTable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public DataTable(){
        setImage(new GreenfootImage(180,130));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,180,130);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(3,3,174,124);
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,180,35);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(3,3,174,29);
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,35,90,130);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(3,35,84,92);
    }
}
