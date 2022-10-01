package utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbc {
    public static Connection getConnection() {
        Connection c = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        String url = "jdbc:mysql://localhost:3306/cms";

        try {
            c = DriverManager.getConnection(url, "root", "Arup@MySQL");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }

}

