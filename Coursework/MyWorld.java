import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int rampAngle = 45;
    //double rampAngle1;
    double rampAngle2 = 45;
    double angleRadians;
    int xSide;
    int ySide;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Ramp ramp1 = new Ramp(0);
        addObject(ramp1,115,320);
        
        Ramp ramp2 = new Ramp((int)rampAngle2);
        addObject(ramp2,215,320);
        ramp2.setLocation(theXSides(),theYSides());
        
        
    }
    public int getRampAngle(){
        return rampAngle;
    }
    public double xSide(){
        double x;
        rampAngle = (int)Math.toRadians(rampAngle);
        x = 100 * Math.cos(rampAngle);
        return(x);
    }
    public double ySide(){
        double y;
        rampAngle = (int)Math.toRadians(rampAngle);
        y = 100 * Math.sin(rampAngle);
        return(y);
    }
    
    public int theXSides(){
        angleRadians = Math.toRadians(rampAngle2);
        xSide = (int)(215 - 100 * Math.cos(angleRadians));
        
        return(xSide);
    }
    public int theYSides(){
        angleRadians = Math.toRadians(rampAngle2);
        
        ySide = (int)(320 - 100 * Math.sin(angleRadians));
        return(ySide);
    }
    
}
