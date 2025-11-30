import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane; // allows me to have inputs
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
    
    StartButton startButton1 = new StartButton(); // creates start button object
    boolean startButton = false;
    
    Ball ball = new Ball(); // creates ball object
    
    
    Data rampAngleData = new Data("Ramp Angle: "); // creates data object for ramp angle
    int rampAngle =45; // creates integer variable for ramp angle
    String inputAngle; // creates string variable for ramp angle for input
    Ramp ramp2 = new Ramp(rampAngle);
    
    Data massData = new Data("Mass: "); // creates object for mass
    int mass=0; // creates integer variable for mass
    String inputMass; // creates string variable for mass for inputs
    
    Data frictionData = new Data("Friction: "); // creates object for friction
    int friction=0; // creates integer variable for friction
    String inputFriction; // creates string variable for friction for inputs
    
    Data velocityData = new Data("Velocity "); // creates object for velocity
    double velocity =0;
    
    Data xVelocityData = new Data("X-Velocity "); // creates object for x axis velocity
    
    Data yVelocityData = new Data("Y-Velocity "); // creates object for y axis velocity
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Ramp ramp1 = new Ramp(0); // creates object for the first ramp and sets an input to 0
        addObject(ramp1,115,320); // adds the object into the world
        
        
        addObject(ramp2,215,320); //adds object into the world
        ramp2.setLocation(theXSides(),theYSides()); //sets the location of ramp2 using 2 methods
        
        addObject(startButton1,512,58); // adds object for start button
        showText("Start",512,58); // adds texts to the world
        
        addObject(ball,theBallXSides(),theBallYSides()); // adds object for ball into the world
        
        addObject(rampAngleData, 105,55); // adds object for ramp angle into the world
        showText(""+ rampAngle,195,55);
        
        addObject(massData, 105,85); // adds object for mass into the world
        showText(""+ mass,195,85);
        
        addObject(frictionData,105,115); // adds object for friction into the world
        showText(""+ friction,195,115);
        
        DataTable dataTable = new DataTable(); // creates object for the changeable data table
        addObject(dataTable,153,65); // adds object for the changeable data table into the world
        showText("You Can Change",153,15);
        
        DataTable dataTable2 = new DataTable(); // creates object for the unchangeable data table
        addObject(dataTable2,335,65); // adds object for the unchangeable data table into the world
        
        setPaintOrder(Data.class, DataTable.class); // makes it so all the objects from the data class are above the data table
        
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
        return rampAngle; // gets the ramp angle from here and returns it for use anywhere this methods called
    }
    public double xSide(){
        double x;
        rampAngle = (int)Math.toRadians(rampAngle);// changes the variable from degrees to radians as needed
        x = 100 * Math.cos(rampAngle); // works out the change i need to move in x
        return(x); // returns value
        
    }
    public double ySide(){
        double y;
        rampAngle = (int)Math.toRadians(rampAngle);// changes the variable from degrees to radians as needed
        y = 100 * Math.sin(rampAngle); // works out the change i need to move in y
        return(y); // returns value
    }
    
    public int theXSides(){
        angleRadians = Math.toRadians(rampAngle);// changes the variable from degrees to radians as needed
        xSide = (int)(215 - 100 * Math.cos(angleRadians)); //works out where the x coordinate should be
        
        return(xSide); // returns value
    }
    public int theYSides(){
        angleRadians = Math.toRadians(rampAngle);// changes the variable from degrees to radians as needed
        
        ySide = (int)(320 - 100 * Math.sin(angleRadians));//works out where the y coordinate should be
        return(ySide);// returns value
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
        underRamp();
        pastWall();
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
    public void underRamp(){
        if(ball.getY() > 325){
            ball.setLocation(ball.getX(),300);
        }
    }
    public void pastWall(){
        if(ball.getX() > 491){
            ball.setLocation(480,ball.getY());
            ball.velocity = 0;
            ball.xVelocity = 0;
            ball.yVelocity = 0;
            
            
        }
    }
    
    
    
}
