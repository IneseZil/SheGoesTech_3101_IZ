package homework;

import java.util.Arrays;

public class HW2_1208_MinMaxMethods {
    public static void main(String[] args) {

        int [] my_array = {1,67,98,76,97,99,97,234,123,3656,2312,-312,31,3454,3};
        System.out.println("Original array :"+ Arrays.toString(my_array));

        System.out.println("Maximum value for the array = " + maxMeth(my_array));
        System.out.println("Minimum value for the array = " + minMeth(my_array));
    }
    public static int maxMeth(int [] my_array) {
        int max = my_array[0];
        for (int i : my_array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int minMeth(int [] my_array) {
        int min = my_array[0];
        for (int i : my_array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
