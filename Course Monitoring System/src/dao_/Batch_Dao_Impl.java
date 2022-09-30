package dao_;

import bean_.Batch;
import exception_.Batch_Exception;
import utility.Dbc;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Batch_Dao_Impl implements Batch_Dao{

    @Override
    public void createBatch(Batch batch) {
        Connection conn= Dbc.getConnection();
        try {
            int b_id=batch.getBatchId();
            int c_Id=batch.getCourseId();
            int f_Id=batch.getFacultyId();
            int NOS=batch.getNumberOfStudent();
            String bsd= batch.getBatchStartDate();
            String duration=batch.getDuration();
            PreparedStatement ps=conn.prepareStatement("insert into batch values(?,?,?,?,?,?)");
            ps.setInt(1,b_id);
            ps.setInt(2,c_Id);
            ps.setInt(3,f_Id);
            ps.setInt(4,NOS);
            ps.setString(5,bsd);
            ps.setString(6,duration);
            ps.executeUpdate();
            System.out.println("Inserted Successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //-----------------------------------------viewBatch-----------------------------------------------------
    @Override
    public List<Batch> viewCourse() {
        List<Batch> blist=new ArrayList<Batch>();

        Connection conn=Dbc.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("select * from batch;");
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
                int b_id=rs.getInt(1);
                int c_id=rs.getInt(2);
                int f_id=rs.getInt(3);
                int NOS=rs.getInt(4);
                String date=rs.getString(5);
                String duration=rs.getString(6);
                Batch b1=new Batch(b_id,c_id,f_id,NOS,date,duration);
                blist.add(b1);
            }
            if(rs==null){
                throw new Batch_Exception("Record Not found");
            }

        } catch (SQLException | Batch_Exception e) {
            throw new RuntimeException(e);
        }

        return blist;
    }


    //-------------------------------------------updateBatch---------------------------------------------

    @Override
    public void updateBatch(int bi, String f, String s) {

        Connection conn=Dbc.getConnection();
        try {
            Statement sm=conn.createStatement();
            int ans=sm.executeUpdate("update Batch set "+f+" = "+s+" where batchId="+bi+"");
            if(ans==1) {
                System.out.println("Updated Successfully");
            }else {
                System.out.println("Not Updated");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
