import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    double velocity =0;
    int mass =5;
    int rampAngle = 45;
    float friction = 5;
    boolean startButton;
    int time = 0;
    double xVelocity;
    double yVelocity;
    
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (startButton == true){ 
            time++; // adds time up by one every act
            velocity(); // calls velocity and gets the returned variable
            position(); // makes it so the ball moves by calling the method
            Wall wall = new Wall();
            wall();
            
        }
    }
    public double acceleration(){
        double acceleration; // creates variable for acceleration
        double force = mass*9.8*Math.sin(rampAngle) - friction; // is calculation to work out the force
        acceleration = force / mass; // calculation to work out the acceleration
        return acceleration; // makes it so if you call this method you will get the variable returned
    }
    public double velocity(){
        velocity = velocity + acceleration();
        return velocity;
    }
    public double xVelocity(){
        xVelocity = velocity()*Math.cos(rampAngle); // gets the velocity and works out the speed in the x 
        return xVelocity; // returns the value
    }
    public double yVelocity(){
        yVelocity = velocity()*Math.sin(rampAngle); // gets the velocity and works out the speed in the y
        return yVelocity; // returns the value
    }
    public void position(){
        
        if(isTouching(Floor.class)){
            setLocation(getX() + (int)xVelocity(),getY()); // moves the ball just in x
        }
        else{
            setLocation(getX() + (int)xVelocity(),getY() + (int)yVelocity()); // moves the ball by x and by y
        }
    }
    public void wall(){
        
        if(isTouching(Wall.class)){
            velocity = 0;
            mass = 0;
            rampAngle = 45;
            friction = 0;
            startButton = false;
            time = 0;
            // it resets all of the values to there beginning value
            xVelocity = 0;
            yVelocity = 0; 
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.startButton = false;
        }
        
        
    }
    public Ball(){
        getImage().scale(40,40); // sets the image size to a size that will work in the simulator
        // double velocity =2;
        //int mass =11;
        //int rampAngle = 40;
        //float friction = 90;
        //boolean startButton = true;
        //int time = 0;
        //double xVelocity;
        //double yVelocity;
    }
    public void setStartButton(boolean startButton){
        this.startButton = startButton;
    }
    public void setRampAngle(int rampAngle){
        this.rampAngle = rampAngle;
    }
    public void setMass(int mass){
        this.mass = mass;
    }
    public void setFriction(int friction){
        this.friction = friction;
    }
    
}
