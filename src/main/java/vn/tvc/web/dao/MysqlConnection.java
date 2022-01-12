package vn.tvc.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
    private static MysqlConnection instance;
    private static String jdbcURLFormat = "jdbc:mysql://localhost:3306/%s?useSSL=false";
    private static String databaseName;
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "ucvt";

    private MysqlConnection() {

    }

    public static MysqlConnection getInstance() {
        if (instance == null)
            instance = new MysqlConnection();
        return instance;
    }

    public void init(String databaseName) {
        this.databaseName = databaseName;
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcURL = String.format(jdbcURLFormat, databaseName);
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (Exception e) {
            throw new IllegalArgumentException("DB name invalid");
        }
        return connection;
    }
}
