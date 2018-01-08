package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLEx
    private static Cotion theConnection = null;
    private static String URL = "jdbc:mysql://localhost/mydbase";
    private static StUSERNAME = "root";
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
