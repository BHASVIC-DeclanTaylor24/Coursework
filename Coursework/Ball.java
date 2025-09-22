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
    int mass =0;
    int rampAngle = 45;
    float friction = 0;
    boolean startButton = false;
    int time;
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
            time++;
            velocity();
            
        
        }
    }
    public double acceleration(){
        double acceleration;
        acceleration = mass*9.8*Math.sin(rampAngle) - friction;
        return acceleration; // Need to divide by mass
    }
    public double velocity(){
        velocity = velocity + acceleration() * (time/60);
        return velocity;
    }
    public double xVelocity(){
        xVelocity = velocity()*Math.cos(rampAngle);
        return xVelocity;
    }
    public double yVelocity(){
        yVelocity = velocity()*Math.sin(rampAngle);
        return yVelocity;
    }
}
