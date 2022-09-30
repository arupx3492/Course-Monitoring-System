package dao_;

import bean_.Course;
import utility.Dbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Course_Dao_Impl implements Course_Dao{

    @Override
    public void createCourse(Course course) {

        Connection conn=utility.Dbc.getConnection();
        try {
            int c_Id=course.getCourseId();
            String c_Name=course.getCourseName();
            int fee= course.getFee();
            String c_Description=course.getCourseDescription();
            PreparedStatement ps=conn.prepareStatement("insert into course values(?,?,?,?)");
            ps.setInt(1,c_Id);
            ps.setString(2,c_Name);
            ps.setInt(3,fee);
            ps.setString(4,c_Description);
            ps.executeUpdate();
            System.out.println("Inserted successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //------------------------------------viewCourse---------------------------------------------------
    @Override
    public List<Course> viewCourse() {
        List<Course> clist = new ArrayList<Course>();
        Connection conn= Dbc.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from course;");
          ResultSet rs= ps.executeQuery();
          while (rs.next()) {
              int c_id = rs.getInt(1);
              String c_name = rs.getString(2);
              int fee=rs.getInt(3);
              String cd=rs.getString(4);
              Course c1=new Course(c_id,c_name,fee,cd);
              clist.add(c1);
          }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return clist;
    }

    //--------------------------------------------updateCourse---------------------------------------------

    @Override
    public void updateCourse(int ci, String f, String s) {

        Connection conn=Dbc.getConnection();
        try {
            Statement sm=conn.createStatement();
           int ans= sm.executeUpdate("Update course set "+f+"="+s+" where courseId="+ci+"");
           if(ans==1) {
               System.out.println("Updated Successfully");
           }else{
               System.out.println("Not Updated");
           }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
