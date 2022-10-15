package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getMyConnection(){
        final String connectionURL = "jdbc:mysql://localhost:3306/db_for_113";
        final String userName = "root";
        final String password = "root";
        try {
            return DriverManager.getConnection(connectionURL, userName, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
