import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    boolean startButton = false;
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        startGame();
    }
    public StartButton(){
        setImage(new GreenfootImage(110,60));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,110,60);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(3,3,104,54);
        
    }
    public void startGame(){
        //if(Greenfoot.mouseClicked() == true){
        //    startButton = true;
        //}
    }
}
