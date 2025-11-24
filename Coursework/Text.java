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
    }
    public void header(){
        setImage(new GreenfootImage("RAMPLE WORLD",50,Color.BLACK, Color.WHITE));
    }
    public void Question(){
        setImage(new GreenfootImage("What Is The Simulator About?",25,Color.BLACK, Color.WHITE));
    }
    public void explain(){
        setImage(new GreenfootImage(400,70));
        getImage().drawString("This is a simulator that is made to help people understand how the ramp and ball interact with each other and can help A level Students with there Maths and Physics",30,30);
        getImage().drawString("ramp and ball interact with each other and can help A level Students",30,50);
        getImage().drawString("with there Maths and Physics",130,70);
        getImage().setColor(Color.BLACK);
        
        
    }
}
