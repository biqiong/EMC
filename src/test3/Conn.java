package test3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {


    public static Connection connection = null;

    public static Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            connection = getNewConnection();
        }
        return connection;
    }

    private static Connection getNewConnection() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        String hostname = "localhost";
        String port = "3306";
        String name = "EMC";
        String username = "root";
        String password = "";
        Connection con = null;
        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + name;
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
