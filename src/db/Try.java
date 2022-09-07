package db;

public class Try {
    public static void main(String[] args) {

        //int[] numbers = {1,2,3};
        //System.out.println(numbers[3]);

        try{
            int[] numbers = {1,2,3};
            System.out.println(numbers[3]);
        } catch (Exception e){
            System.out.println(e);
            System.out.println("something went wrong");
        }

    }

}
