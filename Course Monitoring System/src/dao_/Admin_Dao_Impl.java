package dao_;

import utility.Dbc;

import java.sql.*;

public class Admin_Dao_Impl implements Admin_Dao{

    @Override
    public boolean admin_login(String username, String password) {
        Connection conn= Dbc.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("Select * from Admin;");
            ResultSet rs= ps.executeQuery();
            if(rs.next()) {
                String user=rs.getString(1);
                String pass=rs.getString(2);

                if(user.equals(username)){
                    if(pass.equals(password)){
                        return true;
                    }else {
                        System.out.println("Wrong Password");
                    }
                }else{
                    System.out.println("Wrong Username");
                }
            }
            return false;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
