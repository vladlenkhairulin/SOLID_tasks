package OCP;

public class Vehicle {
    int maxSpeed;
    double indexOfSpeed;

    public Vehicle(int maxSpeed, double indexOfSpeed) {
        this.maxSpeed = maxSpeed;
        this.indexOfSpeed = indexOfSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getIndexOfSpeed() {
        return this.indexOfSpeed;
    }
}
