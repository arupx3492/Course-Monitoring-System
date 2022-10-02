package dao_;

import bean_.Faculty;
import exception_.Faculty_Exception;
import utility.Dbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
//--------------------------------------------Update Faculty-------------------------------------------

    @Override
    public void updateFaculty(int fi, String f, String s) {

        Connection conn = utility.Dbc.getConnection();
        try {
            Statement sm = conn.createStatement();
            int ans = sm.executeUpdate("Update Faculty set " + f + " = '" + s + "' where facultyId= " + fi + " ");
            if (ans > 0) {
                System.out.println("Update Successful");
            } else {
                System.out.println("Update Not Done");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


    //-------------------------------------------------View Faculty------------------------------------------
    @Override
    public List<Faculty> viewFaculty() {
        ArrayList list = new ArrayList();

        Connection conn = Dbc.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("Select * from Faculty;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int f_id = rs.getInt(1);
                String f_name = rs.getString(2);
                String f_address = rs.getString(3);
                String f_mobile = rs.getString(4);
                String f_email = rs.getString(5);
                String f_username = rs.getString(6);
                String f_password = rs.getString(7);
                Faculty f1 = new Faculty(f_id, f_name, f_address, f_mobile, f_email, f_username, f_password);
                list.add(f1);
            }
            if (rs == null) {
                Faculty_Exception fe = new Faculty_Exception("No record found");
                throw fe;
            }
        } catch (SQLException | Faculty_Exception e) {
            throw new RuntimeException(e);
        }

        return list;
    }


    //-------------------------------------------updateFacultyPassword---------------------------------------------------------

    @Override
    public void updateFacultyPassword(int fi, String pass) {

        Connection conn = Dbc.getConnection();
        try {
            Statement sm = conn.createStatement();
            int ans = sm.executeUpdate(" update faculty set password = '" + pass + "' where FacultyId =" + fi + ";");
            if (ans == 1) {
                System.out.println("Password Updated Successfully");
            } else {
                System.out.println("Faculty not Exist");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    //--------------------------------------------faculty login----------------------------------

    @Override
    public boolean facultyLogin(String user, String password, int fid) {

        Connection conn = Dbc.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select facultyName, username , password from faculty where facultyId=" + fid + "");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String uuser = rs.getString(2);
                String upass = rs.getString(3);
                if (user.equals(uuser)) {
                    if (upass.equals(password)) {
                        return true;
                    } else {
                        System.out.println(upass);
                        System.out.println("Wrong password");
                    }
                } else {
                    System.out.println("Wrong Username");
                }
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
