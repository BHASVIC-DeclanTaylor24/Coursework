import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    double velocity =2;
    int mass =11;
    int rampAngle = 40;
    float friction = 90;
    boolean startButton = true;
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
            time++;
            velocity();
            position();
            if(isTouching(Wall.class)){
                wall();
            }
        }
    }
    public double acceleration(){
        double acceleration;
        double force = mass*9.8*Math.sin(rampAngle) - friction;
        acceleration = force / mass;
        return acceleration;
    }
    public double velocity(){
        velocity = velocity + acceleration();
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
    public void position(){
        if(isTouching(Floor.class)){
            setLocation(getX() + (int)xVelocity(),getY()); 
        }
        else{
            setLocation(getX() + (int)xVelocity(),getY() + (int)yVelocity);
        }
    }
    public void wall(){
        velocity = 0;
        mass = 0;
        rampAngle = 45;
        friction = 0;
        startButton = false;
        time = 0;
    }
    public Ball(){
        getImage().scale(40,40);
    }
}
