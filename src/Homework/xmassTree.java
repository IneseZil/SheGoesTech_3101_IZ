package homework;

//two For loops in one outer For loop
//need to change number of spaces and star symbols then switch to the next line and repeat
//then three # in the middle

import java.util.Scanner;

public class xmassTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Xmass tree height");
        int height = scanner.nextInt();

        for (int i =0; i < height; i++) {

            for (int spaces = 0; spaces < height - i; spaces++) { //prints space until reaches number of lines-1
                System.out.print(" ");
            }
            for (int stars = 0; stars < (2 * i + 1); stars++) { //ads up stars each new line the same as 2*line #+1
                System.out.print("%");
            }
            System.out.println();
            }
        for (int i = 0; i < 1; i++) {
            for (int spaces = 0; spaces < height - i-1; spaces++) { //prints spaces in one line until reaches center
                System.out.print(" ");
            }
            for (int foot = 0; foot < 1; foot++ ) { //just one leg :-) just a random comment

                System.out.println("_#_");
            }
        }
        }

    }
