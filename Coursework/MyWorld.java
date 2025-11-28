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
    //int rampAngle = 45;
    //double rampAngle1;
    //double rampAngle2 = 45;
    double angleRadians;
    int xSide;
    int ySide;
    
    StartButton startButton1 = new StartButton();
    private boolean startButton = false;
    
    Ball ball = new Ball();
    
    
    Data rampAngleData = new Data("Ramp Angle: ");
    int rampAngle =45;
    String inputAngle;
    Ramp ramp2 = new Ramp(rampAngle);
    
    Data massData = new Data("Mass: ");
    int mass=0;
    String inputMass;
    
    Data frictionData = new Data("Friction: ");
    int friction=0;
    String inputFriction;
    
    Data velocityData = new Data("Velocity ");
    double velocity =0;
    
    Data xVelocityData = new Data("X-Velocity ");
    
    Data yVelocityData = new Data("Y-Velocity ");

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
        
        
        addObject(ramp2,215,320);
        ramp2.setLocation(theXSides(),theYSides());
        
        addObject(startButton1,512,58);
        showText("Start",512,58);
        
        addObject(ball,theBallXSides(),theBallYSides());
        
        addObject(rampAngleData, 105,55);
        showText(""+ rampAngle,195,55);
        
        addObject(massData, 105,85);
        showText(""+ mass,195,85);
        
        addObject(frictionData,105,115);
        showText(""+ friction,195,115);
        
        DataTable dataTable = new DataTable();
        addObject(dataTable,153,65);
        showText("You Can Change",153,15);
        
        DataTable dataTable2 = new DataTable();
        addObject(dataTable2,335,65);
        
        setPaintOrder(Data.class, DataTable.class);
        
        Floor floor1 = new Floor();
        addObject(floor1,308,325);
        
        Floor floor2 = new Floor();
        addObject(floor2,505,325);
        
        Wall wall = new Wall();
        addObject(wall,491,268);
        
        addObject(velocityData, 285,55);
        showText(""+ (int)ball.velocity,375,55);
        
        addObject(xVelocityData, 285,85);
        showText(""+ (int)ball.xVelocity,375,85);
        
        addObject(yVelocityData, 285,115);
        showText(""+ (int)ball.yVelocity,375,115);
        
        showText("You Can't Change",335,15);
        
        Floor floor3 = new Floor();
        addObject(floor3,110,325);
        
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
        angleRadians = Math.toRadians(rampAngle);
        xSide = (int)(215 - 100 * Math.cos(angleRadians));
        
        return(xSide);
    }
    public int theYSides(){
        angleRadians = Math.toRadians(rampAngle);
        
        ySide = (int)(320 - 100 * Math.sin(angleRadians));
        return(ySide);
    }
    public void act(){
        if(Greenfoot.mouseClicked(startButton1)){
            startButton = true;
            
            ball.setStartButton(true);
        }
        ball.wall();
        if(Greenfoot.mouseClicked(rampAngleData)){
            inputAngle = JOptionPane.showInputDialog("Enter Ramp Angle: ");
            rampAngle = Integer.parseInt(inputAngle);
            ball.setRampAngle(rampAngle);
            ramp2.setRotation(rampAngle);
            ramp2.setLocation(theXSides(),theYSides());
            ball.setLocation(theBallXSides(),theBallYSides());
        }
        showText(""+ rampAngle,195,55);
        
        if(Greenfoot.mouseClicked(massData)){
            inputMass = JOptionPane.showInputDialog("Enter Mass: ");
            mass = Integer.parseInt(inputMass);
            ball.setMass(mass);
        }
        showText(""+ mass,195,85);
        
        if(Greenfoot.mouseClicked(frictionData)){
            inputFriction = JOptionPane.showInputDialog("Enter Friction: ");
            friction = Integer.parseInt(inputFriction);
            ball.setFriction(friction);
        }
        showText(""+ friction,195,115);
        
        showText(""+ (int)ball.velocity,375,55);
        showText(""+ (int)ball.xVelocity,375,85);
        showText(""+ (int)ball.yVelocity,375,115);
        
        resetPos();
        
        
    }
    public int theBallXSides(){
        angleRadians = Math.toRadians(rampAngle);
        xSide = (int)(ramp2.getX() - 100 * Math.cos(angleRadians));
        
        return(xSide);
    }
    public int theBallYSides(){
        angleRadians = Math.toRadians(rampAngle);
        
        ySide = (int)(ramp2.getY() - 100 * Math.sin(angleRadians));
        return(ySide);
    }
    public void resetPos(){
        if(ball.startButton == false){
            ball.setLocation(theBallXSides(),theBallYSides());
        }
    }
    
    
    
}
