import utility.Dbc;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        System.out.println("This is for checking ");

        Connection conn= Dbc.getConnection();
        System.out.println(conn);
    }
}
