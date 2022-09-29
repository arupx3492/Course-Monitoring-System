package dao_;

import bean_.Batch;
import utility.Dbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
}
