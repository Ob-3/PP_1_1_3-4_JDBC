package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String URL = "jdbc:mysql://localhost:3306/bdforkata";
    private static final String USER = "root";
    private static final String PASSWORD = "1991_Dvs";

    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Соедиение с БД установленно");
        } catch (SQLException e) {
            System.out.println("Не удалось соединиться с БД");
            throw new RuntimeException(e);
        }
        return connection;
    }
}
