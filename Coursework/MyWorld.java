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
        addObject(ramp2,215,320);
        
    }
    public int getRampAngle(){
        return rampAngle;
    }
}
