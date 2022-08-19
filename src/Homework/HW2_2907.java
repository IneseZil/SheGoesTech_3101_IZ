package homework;

import java.util.Arrays;
public class HW2_2907 {
   public static void main(String[] args) {
        int[] sourceArray = {3, 5, 6, 8, 8, 9, 9, 5};
        int[] newArray = new int[sourceArray.length];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = sourceArray[newArray.length-i-1];
        }

        System.out.println("Source Array: "+Arrays.toString(sourceArray));
        System.out.println("New Array: "+Arrays.toString(newArray));

        //CORRECT SOLUTION reverse Array without creating a new Array
        for (int i = 0; i< sourceArray.length/2;i++) { //get it running until middle of array
            int temp = sourceArray[i]; //store first element
            sourceArray[i] = sourceArray[sourceArray.length - 1 - i]; //assign first element value of last element
            sourceArray[sourceArray.length - 1 - i] = temp; //getting last element its initial value
        }
        System.out.println("Reverse Array: " + Arrays.toString(sourceArray));

    }
}
