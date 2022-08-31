package homework.hw_3108_Vehicle;
public class Car extends Vehicle {
    boolean airConditioner;
    public Car (){
        getFuel();
        getFuelUsage();
        getPassengers();
        this.airConditioner = airConditioner;
    }
    static float maxDistance (float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        float maxDistance;
        if (airConditioner){
            maxDistance = fuel/((fuelUsage*(1+passengers*0.05f))*1.1f)*100;
        } else
            maxDistance = fuel/((fuelUsage*(1+passengers*0.05f)*100));
        return maxDistance;
    }
    public static void main(String[] args) {
        System.out.println(maxDistance(36.1f,8.6f,3,true));
    }
}
