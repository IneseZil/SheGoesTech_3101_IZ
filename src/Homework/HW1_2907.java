package Homework;

import java.util.Arrays;
public class HW1_2907 {
    public static void main(String[] args) {
        int [] sourceArray = {3,5,6,8,8,9};
        int [] newArray = new int[sourceArray.length];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = sourceArray[i];
        }
        System.out.println("Source Array: "+Arrays.toString(sourceArray));
        System.out.println("New Array: "+Arrays.toString(newArray));
    }
}
