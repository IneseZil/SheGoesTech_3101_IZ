package ClassWork;

public class Switch {

    public static void main(String[] args) {
        int month = 45;
        switch (month) {
            case 1:
                System.out.println("in January there is 31");
                break;
            case 2:
                System.out.println("in February there is 28");
                break;
            case 3:
                System.out.println("in March there is 31");
                break;
            case 4:
                System.out.println("in April there is 30");
                break;
            case 5:
                System.out.println("in May there is 31");
                break;
            case 6:
                System.out.println("in June there is 30");
                break;
            case 7:
                System.out.println("in July there is 31");
            case 8:
                System.out.println("in August there is 31");
                break;
            case 9:
                System.out.println("in September there is 30");
                break;
            case 10:
                System.out.println("in October  there is 31");
            case 11:
                System.out.println("in November there is 30");
                break;
            case 12:
                System.out.println("in December there is 31");
                break;
            default:
                System.out.println("Please use numbers 1-12");
        }
    }
}