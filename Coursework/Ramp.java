import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ramp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ramp extends Actor
{
    int length = 200;
    //double rampAngle2 = 45;
    double angleRadians;
    int xSide;
    int ySide;
    int rampAngle;
    /**
     * Act - do whatever the Ramp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //setLocation(getX() - (int)xSide(), getY() + (int)ySide());
        //setLocation(theXSides(),theYSides());
        //System.out.println("Left end: (" + theXSides() + ", " + theYSides() + ")");
        //setRotation(rampAngle);
        
    }
    public Ramp(int rampAngle){
        setImage(new GreenfootImage(200, 10)); //  creates the image
        getImage().setColor(Color.BLACK); // sets image to black
        getImage().fillRect(0,0,200,10); // colours in the whole image
        setRotation(rampAngle); // sets the rotation of the ramp to what ever is inputted
        
        //= (MyWorld)getWorld();
    
    }
    public double xSide(){
        double x;
        MyWorld myWorld = (MyWorld)getWorld(); // allows me to use methods and variables from MyWorld class
        x = 50 * Math.cos(myWorld.getRampAngle()); // works out change i need to move for x
        return(x); // returns value
    }
    public double ySide(){
        double y;
        MyWorld myWorld = (MyWorld)getWorld(); // allows me to use methods and variables from MyWorld class
        y = 50 * Math.cos(myWorld.getRampAngle()); // works out change i need to move for y
        return(y); // returns value
    }
    public double getXSide(){
        return xSide();
    }
    
    public int theXSides(){
        angleRadians = Math.toRadians(rampAngle);
        xSide = (int)(215 - 100 * Math.cos(angleRadians));
        
        return(xSide);
    }
    public int theYSides(){
        angleRadians = Math.toRadians(rampAngle);
        
        ySide = (int)(320 - 100 * Math.sin(angleRadians));
        return(ySide);
    }
    public void setRampAngle(int rampAngle){
        this.rampAngle = rampAngle;
    }
    public void updateRamp(){
        setRotation(rampAngle); 
    }
    
    
    
    
}
