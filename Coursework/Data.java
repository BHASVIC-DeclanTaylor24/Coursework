import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data extends Actor
{
    String dataType;
    /**
     * Act - do whatever the Data wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Data(String dataType){
        this.dataType = dataType;
        setImage(new GreenfootImage(dataType,10,Color.BLACK, Color.WHITE));
    }
}

