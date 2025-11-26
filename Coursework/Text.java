import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Text(int text){
        if(text == 1){
           header(); 
        }
        if (text == 2){
            Question();
        }
        if (text == 3){
            explain();
        }
        if (text == 4){
            start();
        }
    }
    public void header(){
        setImage(new GreenfootImage("RAMPLE WORLD",50,Color.BLACK, Color.WHITE));
    }
    public void Question(){
        setImage(new GreenfootImage("What Is The Simulator About?",25,Color.BLACK, Color.WHITE));
    }
    public void explain(){
        setImage(new GreenfootImage(400,70));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,400,70);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(3,3,394,64);
        getImage().setColor(Color.BLACK);
        getImage().drawString("This is a simulator that is made to help people understand how the ",10,20);
        getImage().drawString("ramp and ball interact with each other and can help A level Students",10,40);
        getImage().drawString("with there Maths and Physics",120,60);
        
        
        
        
    }
    public void start(){
        setImage(new GreenfootImage(150,80));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,150,80);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(3,3,144,74);
        getImage().setColor(Color.BLACK);
        getImage().drawString("START SIMULATOR",20,43);
        
    }
}
