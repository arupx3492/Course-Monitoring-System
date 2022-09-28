package dao_;

import bean_.Faculty;
import utility.Dbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Faculty_Dao_Impl implements Faculty_Dao {
    @Override
    public void registerFaculty(Faculty f) {
        Connection conn = Dbc.getConnection();
        int fid = f.getFacultyId();
        String name = f.getFacultyName();
        String add = f.getFacultyAddress();
        String mob = f.getMobile();
        String email = f.getEmail();
        String un = f.getUserName();
        String pass = f.getPassword();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into faculty values(?,?,?,?,?,?,?);");
            ps.setInt(1, fid);
            ps.setString(2, name);
            ps.setString(3, add);
            ps.setString(4, mob);
            ps.setString(5, email);
            ps.setString(6, un);
            ps.setString(7, pass);

            int ans = ps.executeUpdate();
            if (ans > 0) {
                System.out.println("Inserted successfully");
            } else {
                System.out.println("Insert fail");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
