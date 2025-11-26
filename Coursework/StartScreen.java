import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    Text start = new Text(4);

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        
        Text header = new Text(1);
        addObject(header,300,50);
        
        Text question = new Text(2);
        addObject(question,300,250);
        
        Text explain = new Text(3);
        addObject(explain,300,300);
        
        addObject(start,300,150);
        
        
    }
    public void act(){
        if(Greenfoot.mouseClicked(start)){
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    
    
}
