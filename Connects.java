package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connects {

    private static Connection theConnection = null;
    private static String URL = "jdbc:mysql://localhost/mydbase";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";

    private Connects() {
    }

    public static Connection getTheConnection() {

        if (theConnection == null) {

            try {
                theConnection =  DriverManager.getConnection(URL,USERNAME,PASSWORD);
            } catch (SQLException gg) {
                System.out.println("An error has occurred: " + gg.getMessage());
            }
        }
        return theConnection;
    }

    public static void closeConnection () {

        if (theConnection != null) {
            try {
                theConnection.close();
            } catch (SQLException e) {
                System.out.println("The connection has been closed.");
            }
        }
    }
}
