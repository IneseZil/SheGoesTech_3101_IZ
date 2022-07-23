package ClassWork;

public class MathClass {
    public static void main(String[] args) {
        float num=-5.346f;
        System.out.println(num);

        //rounding down
        System.out.println(Math.floor(num));

        //rounding up
        System.out.println(Math.ceil(num));

        //rounding according to Math principles
        System.out.println(Math.round(num));

        //return absolute value (how far you are from zero) or simple get a number without a minus
        System.out.println(Math.abs(num));

        //power (stepen')
        System.out.println(Math.pow(2,6));

        //square root
        System.out.println(Math.sqrt(64));

        //Max determination
        System.out.println(Math.max(103,126));

        //Min determination
        System.out.println(Math.min(-923789,676));

        //random value
        System.out.println((int) (Math.random()*20) +1);

        //Castling (formatting to extra or without extra decimals)
        System.out.println((int) 99.989);
        System.out.println((float) (10 + 5) * 2.16);

    }
}
