package ClassWork;

public class array2D {
    public static void main(String[] args) {

        int[][] age = new int[][]{{4,5,3,6,2},{34,44,27,43,39}};
        //Print second column values
        System.out.println("child is "+age[0][1] +" years old");
        System.out.println("adult is "+age[1][3] + " years old");

        // example of another declaration
        String [][] names = new String[2][5]; //2 rows and 5 colums

        //1st row
        names[0][0] = "Inese";
        names[0][1] = "Alice";
        names[0][2] = "Tima";
        names[0][3] = "Renārs";
        names[0][4] = "Polina";

        //2nd row
        names[1][0] = "Pavels";
        names[1][1] = "Katrina";
        names[1][2] = "Marks";
        names[1][3] = "Vitalijs";
        names[1][4] = "Ilja";
        //number of rows
        System.out.println("Total rows :"+ names.length);
        //number of columns
        System.out.println("Total columns :"+ names[0].length);
        System.out.println("Total people: "+(names.length*names[0].length));

        //Total people another approach
        // i represents rows AND j represents columns. Nested For loop needed to repeat as many times as many dimensions
        for (int i = 0; i < names.length; i++){
            System.out.println("Row no. " +(i+1));
            for(int j = 0; j < names[i].length; j++){
                System.out.println("Column no. "+(j+1));
                System.out.print(names[i][j] + " ");
            }
        }

        for (String [] tempNames : names){
            System.out.print("Row - ");
            for (String name : tempNames) {
                System.out.print(name + " ");
            }
            System.out.println();

        }
    }
}
