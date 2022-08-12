package Basics.ClassWork;

import java.util.Arrays;

public class ArrayExamp {
    public static void main(String[] args) {
        //Declare array that will hold 3 String type variables
        String[] names = new String[3];

        //How to set array's element values
        names[0] = "Inese";
        names[1] = "Abcd";
        names[2] = "Qwerty";

        //How to get array's element value
        System.out.println(names[1] + " " + names[0] + " " + names[2]);

        int[] grades = new int[10];
        grades[0] = 10;
        grades[1] = 9;
        grades[2] = 1;
        grades[3] = 7;
        grades[4] = 5;
        grades[5] = 2;
        grades[6] = 6;
        grades[7] = 8;
        grades[8] = 3;
        grades[9] = 5;

        //How to get Array's size
        System.out.println("Array's size: " + grades.length);

        //How to print out all elements
        System.out.println("Print all 1st");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }

        //Printing out all array's elements using For-each loop
        System.out.println("");
        System.out.print("Print all 2nd ");
        for (int temp : grades) {
            System.out.print(temp + " ");
        }
        //Example
        int table[]={1,2,3,4,5,6};
            for (int i=0; i<table.length;i++) {
                int value = table[i];
                if (value %2==0){
                System.out.println("even number: " + value);
            }else{
            System.out.println("odd number: " + value);
            }
                System.out.println(Arrays.toString(table));
        }

    }
}