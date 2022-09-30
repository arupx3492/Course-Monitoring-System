package dao_;

import bean_.Course;
import bean_.CoursePlan;
import utility.Dbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course_Plan_Dao_Impl implements Course_plan_Dao{

    @Override
    public void createCoursePlan(CoursePlan c) {
        Connection conn= Dbc.getConnection();

        try {
            PreparedStatement ps=conn.prepareStatement("insert into coursePlan values(?,?,?,?,?);");
            ps.setInt(1,c.getPlanId());
            ps.setInt(2,c.getBatchId());
            ps.setInt(3,c.getDayNumber());
            ps.setString(4,c.getTopic());
            ps.setString(5,c.getStatus());
            int ans=ps.executeUpdate();
            if(ans>0){
                System.out.println("Inserted Successfully");
            }else{
                System.out.println("Not Inserted");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //---------------------------------------------------------viewCoursePlans--------------------------------------------------------------------

    @Override
    public List<CoursePlan> viewCoursePlans() {
        List<CoursePlan> cplist = new ArrayList<CoursePlan>();

        Connection conn=Dbc.getConnection();
        String q="Select * from CoursePlan ;";
        try {
            PreparedStatement ps = conn.prepareStatement(q);
           ResultSet rs= ps.executeQuery();
           while(rs.next()) {
               int p_id=rs.getInt(1);
               int b_id=rs.getInt(2);
               int dnum=rs.getInt(3);
               String topic=rs.getString(4);
               String status=rs.getString(5);
               CoursePlan cp=new CoursePlan(p_id,b_id,dnum,topic,status);
               cplist.add(cp);
           }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return cplist;
    }



    //-------------------------------------------------------updateCoursePlan-------------------------------------------------------

      @Override
    public void updateCoursePlan(int pi, String f, String s) {
        Connection conn=Dbc.getConnection();
          try {
              Statement sm=conn.createStatement();

              int ans = sm.executeUpdate("Update CoursePlan set " + f + " = '" + s + "' where planId= " + pi + " ");
              if(ans==1) {
                  System.out.println("Updated Successfully");
              }else{
                  System.out.println("Not update");
              }

          } catch (SQLException e) {
              throw new RuntimeException(e);
          }
      }

}
