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
        
        Ramp ramp2 = new Ramp(rampAngle);
        addObject(ramp2,215 - (int)xSide(),320 - (int)ySide());
        
    }
    public int getRampAngle(){
        return rampAngle;
    }
    public double xSide(){
        double x;
        
        x = 50 * Math.cos(rampAngle);
        return(x);
    }
    public double ySide(){
        double y;
        
        y = 50 * Math.sin(rampAngle);
        return(y);
    }
}
