package ClassWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("a+bcd");
        Matcher matcher = pattern.matcher("raabcd");
        System.out.println(matcher.matches());      //Matches - checks the whole string
        System.out.println(matcher.find());         //Find searches a substring within a string

        //Any lower case letter or any number from 5 to 9, will accept 3 input chars
        System.out.println(Pattern.matches("[a-z5-9]{3}", "579"));

        //Example acceptable plate numbers HP-2938 PO-2928 LM-879 KM-12 KC-1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car's plate number");
        String platenumber = scanner.nextLine().trim();

        Pattern pattern1 = Pattern.compile("[a-zA-Z]{2}-[0-9]{1,4}");
        Matcher matcher1 = pattern1.matcher(platenumber);
        boolean correctPlate = matcher1.matches();
        if (correctPlate) {
            System.out.println("It is correct");
        } else {
            System.out.println("It is incorrect");

        }
    }

}
