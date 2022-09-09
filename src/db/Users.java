package db;

import java.sql.*;
import java.util.Scanner;

public class Users {
    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String userName = "root";
        String password = "1234";

        Scanner scanner = new Scanner(System.in);
        char runAgain = 'y';

        try (Connection conn= DriverManager.getConnection(dbURL, userName, password)) {
            System.out.println("Connected to DB");

            while (runAgain=='y'){
                System.out.println("Choose (r, i, d)");
                System.out.println("r - reading data");
                System.out.println("i - insert data");
                System.out.println("d - delete data");
                char action = scanner.nextLine().charAt(0);

                if (action=='i'){

                    System.out.println("Enter user name");
                    String inputName = scanner.nextLine();
                    System.out.println("Enter password");
                    String inpuPassword = scanner.nextLine();
                    System.out.println("Enter full name");
                    String inputFullName = scanner.nextLine();
                    System.out.println("Enter email");
                    String inputEmail = scanner.nextLine();

                    insertData(conn, inputName, inpuPassword, inputFullName, inputEmail);

                } else if (action == 'r'){
                    readData(conn);

                }else if (action == 'd'){
                    System.out.println("Username of user you want to delete");
                    String deleteName = scanner.nextLine();
                    deleteData(conn,deleteName);
                }
                System.out.println("Do you want to do anything else?");
                runAgain = scanner.nextLine().charAt(0);
            }

            //readData(conn);
            //insertData(conn, "uzer", "pa55word", "Full", "myemail");

        } catch (Exception e) {
         e.printStackTrace();
        }
    }

    public static void readData (Connection conn) throws SQLException {
        String sql = "SELECT *FROM users";

        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int count = 0;
        while (resultSet.next()){
            String userName = resultSet.getString(2);
            String password = resultSet.getString(3);
            String fullName = resultSet.getString("fullName");
            String email = resultSet.getString("email");

            String output = "User #%d: %s   - %s   - %s   - %s";
            System.out.println(String.format(output, ++count, userName, password, fullName, email));

        }


    }

    public static void insertData (Connection conn, String userName, String password, String fullName, String email) throws SQLException{
        String sql = "INSERT INTO Users (userName, password, fullName, email) VALUE (?, ?, ?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, userName);
        statement.setString(2, password);
        statement.setString(3, fullName);
        statement.setString(4, email);

        int rowsInserted = statement.executeUpdate();
        if(rowsInserted > 0){
            System.out.println("New user created");
        } else {
            System.out.println("Ups! Try again...");
        }

    }

    public static void deleteData (Connection conn, String userName) throws SQLException {
        String sql = "DELETE FROM users WHERE userName =?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, userName);
        int rowsDeleted = statement.executeUpdate();
        if(rowsDeleted > 0){
            System.out.println("A user deleted");
        } else {
            System.out.println("Ups! Try again...");
        }

    }


}
