package Basics.ClassWork;

public class Method {
    public static void main(String[] args) {

        printName("Inese");
        printName("Alise");
        returnName("Renars");
        String introText = returnName("Polina");
        System.out.println(introText);
        System.out.println(returnName("Tima"));

        personInfo("MisterX", 49);
        personInfo("Inese", 39);

        int calculation = sum(4,18,1);
        if (calculation >= 30){
            System.out.println(calculation);
        } else {
            System.out.println("too small");
        }
    }

    public static void printName(String name){      //does not return anything (void)
        System.out.println("Hello your name is "+name);
    }
    public static String returnName (String name){  //does return
        System.out.println("---------inside returnName method----------");
        return "Hello your name is "+name;
    }
    public static void personInfo(String name, int age){
        System.out.printf("Your name is %s and you are %d years old \n", name, age);
    }
    public static int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}
