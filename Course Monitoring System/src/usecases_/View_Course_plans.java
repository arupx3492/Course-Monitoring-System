package usecases_;

import bean_.CoursePlan;
import dao_.Course_Plan_Dao_Impl;
import dao_.Course_plan_Dao;

import java.util.List;

public class View_Course_plans {

    public static void main(String[] args) {
        Course_plan_Dao cpd=new Course_Plan_Dao_Impl();
       List<CoursePlan> cplist= cpd.viewCoursePlans();
       cplist.forEach(cpl->{
           System.out.println("plan Id = "+cpl.getPlanId());
           System.out.println("Batch Id = "+cpl.getBatchId());
           System.out.println("Day Number = "+cpl.getDayNumber());
           System.out.println("Topics = "+cpl.getTopic());
           System.out.println("Status = "+cpl.getStatus());
           System.out.println("======================================================");
       });
    }
}
