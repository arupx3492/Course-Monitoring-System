import utility.Dbc;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo {
    public static void main(String[] args) {
        System.out.println("This is for checking ");

        Connection conn= Dbc.getConnection();
        System.out.println(conn);
        String bsd="2022/05/05";
         DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate date= LocalDate.parse(bsd,dtf);
            String s=date.toString();
    }
}
