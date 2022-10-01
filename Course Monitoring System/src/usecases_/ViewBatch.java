package usecases_;

import bean_.Batch;
import dao_.Batch_Dao;
import dao_.Batch_Dao_Impl;

import java.util.List;

public class ViewBatch {

    public static void viewBatch() {
        Batch_Dao bd=new Batch_Dao_Impl();
       List<Batch> bl= bd.viewCourse();
        bl.forEach(b->{
            System.out.println("Batch Id = "+b.getBatchId());
            System.out.println("Course Id = "+b.getCourseId());
            System.out.println("Faculty Id = "+b.getFacultyId());
            System.out.println("Number of Student = "+ b.getNumberOfStudent());
            System.out.println("Batch start Date = "+b.getBatchStartDate());
            System.out.println("Duration = "+b.getDuration());
            System.out.println("===========================================================");
        });

    }
}
