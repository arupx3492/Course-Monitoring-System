package usecases_;

import bean_.CoursePlan;
import dao_.Course_Plan_Dao_Impl;
import dao_.Course_plan_Dao;

import java.util.Scanner;

public class Create_Course_plan {

    public static void createCoursePlan() {

            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Plan Id ");
        int p_id = scanner.nextInt();
        System.out.println("Enter Batch Id");
        int b_id=scanner.nextInt();
        System.out.println("Enter Day Number");
        int dnum=scanner.nextInt();
        System.out.println("Enter Topic");
        String topic = scanner.next();
        System.out.println("Choose status");
        System.out.println("1.Complete");
        System.out.println("2.Pending");
        int topicNum=scanner.nextInt();
        String status;
        if(topicNum==1){
            status="Complete";
        }else {
            status="Pending";
        }
        CoursePlan cp=new CoursePlan(p_id,b_id,dnum,topic,status);

        Course_plan_Dao cpd=new Course_Plan_Dao_Impl();
        cpd.createCoursePlan(cp);
    }
}
