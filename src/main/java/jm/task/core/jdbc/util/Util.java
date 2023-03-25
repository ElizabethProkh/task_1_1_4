package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static final String BD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String BD_URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
    public static final String BD_USERNAME = "root1";
    public static final String BD_PASSWORD = "root2";

    public static Connection getConnection () {
        Connection connection = null;
        try {
            Class.forName(BD_DRIVER);
            connection = DriverManager.getConnection(BD_URL,BD_USERNAME,BD_PASSWORD);
//            System.out.println("connection ok");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
