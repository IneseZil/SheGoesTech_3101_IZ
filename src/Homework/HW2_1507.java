package homework;

import java.util.Scanner;

public class HW2_1507 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter speed in mp/h");

        float SpeedMph = scanner.nextFloat();
        float SpeedKmh = (float) (SpeedMph*1.6);

        System.out.print(SpeedMph + " mp/h in km/h would be equal to " + SpeedKmh + " km/h");
    }
}
