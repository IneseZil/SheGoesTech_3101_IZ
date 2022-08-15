package OOP;

import java.util.Scanner;

public class CallingBook {
    public static void main(String[] args) {

        //Creating Book class object
        Book book1 = new Book();
        book1.printBookInfo();

        book1.setTitle("Impatience of the Heart");
        book1.setAuthor("Stefan Zweig");
        book1.setNumbOfPages(10);

        book1.printBookInfo();

    }
}
