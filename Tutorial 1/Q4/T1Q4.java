package t1q4;

public class T1Q4 {

    
    public static void main(String[] args) {
        Vehicle car = new Vehicle(50.0);
    }
    
}

abstract class Vehicle{
    private double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double maxSpeed){
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    
    public abstract void accelerate();
    
    public double getCurrentSpeed(){
        return this.currentSpeed;
    }
    
    public double getMaxSpeed(){
        return this.maxSpeed;
    }
    
    public void pedalToTheMetal(){
        while (currentSpeed < maxSpeed){
            this.accelerate();
        }
    }   
}

// No, an instance cannot be created because it is an abstract class
