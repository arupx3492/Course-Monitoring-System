package usecases_;

import dao_.Course_Plan_Dao_Impl;
import dao_.Course_plan_Dao;

import java.util.Scanner;

public class Update_Course_Plan {

    public static void updateCoursePlan() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Plan Id");
        int p_id = scanner.nextInt();
        System.out.println("What you want to update");
        System.out.println("1.Batch Id");
        System.out.println("2.Day Number");
        System.out.println("3.Topic");
        System.out.println("4.Status");
        int opt = scanner.nextInt();

        String f;

        if (opt == 1) {
            f = "batchId";
        } else if (opt == 2) {
            f = "dayNumber";
        } else if (opt == 4) {
            f = "status";
        } else {
            f = "topic";
        }

        String s;

        if (f.equals("status")) {
            System.out.println("Choose status");
            System.out.println("1.Complete");
            System.out.println("2.Pending");
            int topicNum = scanner.nextInt();
            if (topicNum == 1) {
                s = "Complete";
            } else {
                s = "Pending";
            }
        } else {
            System.out.println("Enter the Updated Value");
            s = scanner.next();
        }
        Course_plan_Dao cpd = new Course_Plan_Dao_Impl();
        cpd.updateCoursePlan(p_id, f, s);

    }
}
