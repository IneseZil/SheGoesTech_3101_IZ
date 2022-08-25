package homework.hw_3108_Vehicle;

public class Car extends Vehicle {
    private boolean airConditioner;


    public Car (){
        getFuel();
        getFuelUsage();
        getPassengers();
        this.airConditioner = airConditioner;
    }

    static float maxDistance (float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        float maxDistance;
        if (airConditioner){
            maxDistance = (float) (fuel/((fuelUsage*(1+passengers*0.05))*1.1)*100);
        } else
            maxDistance = (float) (fuel/((fuelUsage*(1+passengers*0.05)*100)));
        return maxDistance;
    }


    public static void main(String[] args) {
        System.out.println(maxDistance(36.1f,8.6f,3,true));
    }
}
