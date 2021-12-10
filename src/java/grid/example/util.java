package grid.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class util {
    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts?autoReconnect=true&useSSL=false", "root", "rootpw");
        } catch (SQLException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
