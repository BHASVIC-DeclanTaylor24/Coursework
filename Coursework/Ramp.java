import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ramp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ramp extends Actor
{
    
    /**
     * Act - do whatever the Ramp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //setLocation(getX() - (int)xSide(), getY() + (int)ySide());
    }
    public Ramp(int rampAngle){
        setImage(new GreenfootImage(200, 10));
        getImage().setColor(Color.BLACK);
        getImage().fillRect(0,0,200,10);
        setRotation(rampAngle);
        
        
    }
    public double xSide(){
        double x;
        MyWorld myWorld = (MyWorld)getWorld();
        x = 50 * Math.cos(myWorld.getRampAngle());
        return(x);
    }
    public double ySide(){
        double y;
        MyWorld myWorld = (MyWorld)getWorld();
        y = 50 * Math.cos(myWorld.getRampAngle());
        return(y);
    }
    public double getXSide(){
        return xSide();
    }
    
    
}
