package jm.task.core.jdbc.util;

import java.sql.*;
import java.util.Properties;

public class Util {

    static private String URL = "jdbc:mysql://localhost:3306/kata_1_1_3";
    static private String name = "root";
    static private String password = "4815162342kik";


    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, name, password);

            if (!connection.isClosed()) {
                System.out.println("Соединение  с БД установлено");
            }

            if (connection.isClosed()) {
                System.out.println("Cоединение с БД закрыто");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            return connection;
        }

    }


