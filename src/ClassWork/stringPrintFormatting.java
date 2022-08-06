package ClassWork;

public class stringPrintFormatting {
    public static void main(String[] args) {

        //s - string
        //f - float, double
        //d - decimal/integers
        //c - char
        //b - boolean

        String name = "Bob";
        int age = 38;

        System.out.println("Hello "+name+" your age is "+age);
        System.out.printf("Hello %s your age is %d \n", name, age);
        System.out.printf("Hello %s your age is %d. Nice to meet you %s \n",name,age,name);
        System.out.printf("Hello %1$s your age is %2$d. Nice to meet you %1$s \n",name,age);

        double height = 189.123576d;
        System.out.printf("%s is %.2f cm tall \n",name,height);


    }
}