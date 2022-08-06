package ClassWork;

import java.util.Scanner;

public class stringExamp {
    public static void main(String[] args) {

        String myString = new String("This is a simple text");
        System.out.println(myString);
        myString += "with added text";
        System.out.println(myString);

        String text1 = "Again another example";
        String text2 = text1.intern();      //assigning a value
        System.out.println(text2);

        String concat1 = "this is concatenation";
        String concat2 = " function";
        String concatFinal = concat1 + concat2; //method 1
        String concatFinal2 = concat1.concat(concat2); //method2
        System.out.println(concatFinal2);

        //comparing Strings
        String val1 = "test";
        String val2 = "test";
        System.out.println(val1.equals(val2));

        //STRING CALSS METHODS

        String inputText = "This is my text";
        //lenght
        System.out.println(inputText.length());

        //to UPPERCASE
        System.out.println(inputText.toUpperCase());

        //to lowercase
        System.out.println(inputText.toLowerCase());

        //STRING METHODS - INDEX(OF)
        String speakingText = "This is some long random boring text";
        System.out.println(speakingText.indexOf('x'));

        //REPLACE ALL  //Šūdas
        String textToReplace = "This computer is complete šūdas. And the day also is šūdas.";
        System.out.println(textToReplace.replaceAll("šūdas", "beeeep"));

        //Character index
        System.out.println(textToReplace.charAt(textToReplace.length()-1));

        //Substring crops from Index1 to Index2
        System.out.println(textToReplace.substring(16,44));

        //Parsing
        //Converting String to primitive Data types
        String intValue = "116";
        String floatValue = "2.98";
        String doubleValue = "2.546789";
        String boolValue = "false";
        String longValue = "1234567890123456789";

        System.out.println(Integer.parseInt(intValue)+1);
        System.out.println(Float.parseFloat(floatValue)+2);
        System.out.println(Double.parseDouble(doubleValue)+3);
        System.out.println(Boolean.parseBoolean(boolValue));
        System.out.println(Long.parseLong(longValue)+5);

        //Trim method
        System.out.println("     This is test text    ".trim());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input password (qwert*)");
        String pswd = scanner.nextLine().trim().toLowerCase();

        if(pswd.equals("qwert*")){
            System.out.println("Password correct");
        } else System.out.println("Password incorrect");



    }
}