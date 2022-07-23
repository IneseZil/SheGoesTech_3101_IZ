package ClassWork;

public class ArrayExamp {
    public static void main(String[] args) {
        //Declare array that will hold 3 String type variables
        String[] names = new String[3];

        //How to set array's element values
        names[0] = "Inese";
        names[1] = "Abcd";
        names[2] = "Qwerty";

        //How to get array's element value
        System.out.println(names[1]+" "+names[0]+" "+names[2]);

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
        for(int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]+" ");
            }
        }
    }
