import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
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
    
    StartButton startButton1 = new StartButton();
    private boolean startButton = false;
    
    Ball ball = new Ball();
    
    Data rampAngleData = new Data("Ramp Angle: ");
    int rampAngle1;
    String inputAngle;

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
        
        addObject(startButton1,512,58);
        showText("Start",512,58);
        
        addObject(ball,95,163);
        
        addObject(rampAngleData, 50,100);
        showText(""+ rampAngle1,100,100);
        
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
    public void act(){
        if(Greenfoot.mouseClicked(startButton1)){
            startButton = true;
            
            ball.setStartButton(true);
        }
        
        if(Greenfoot.mouseClicked(rampAngleData)){
            inputAngle = JOptionPane.showInputDialog("Enter Ramp Angle: ");
            rampAngle1 = Integer.parseInt(inputAngle);
        }
        showText(""+ rampAngle1,100,100);
    }
    
    
}
