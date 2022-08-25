package homework.hw_3108_Vehicle;

public class Vehicle {

    private float fuel;
    private float fuelUsage;
    private int passengers;

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setFuelUsage(float fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public float getFuel() {
        return fuel;
    }
    public float getFuelUsage() {
        return fuelUsage;
    }
    public int getPassengers() {
        return passengers;
    }

    static float maxDistance(float fuel, float fuelUsage, int passengers) {
        return (float) (fuel/(fuelUsage*(1+passengers*0.05))*100);
    }

    public static void main(String[] args) {
        System.out.println("Maximum distance is: "+maxDistance(55.5f, 5.5f, 5));
    }
}
