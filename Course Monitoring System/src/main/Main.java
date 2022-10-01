package main;

import dao_.*;
import usecases_.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("                                                            Welcome to Course Monitoring ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Option");

        System.out.println("1.Admin");
        System.out.println("2.Faculty");
        int user = scanner.nextInt();
        switch (user) {
            case 1:
                System.out.println("Enter user name");
                String username = scanner.next();
                System.out.println("Enter Password");
                String password = scanner.next();
                Admin_Dao ad = new Admin_Dao_Impl();
                boolean al = ad.admin_login(username, password);
                System.out.println();
                if (al) {
                    System.out.println("Select Option");
                    System.out.println();
                    System.out.println("1.Create Course");
                    System.out.println("2.Update Course");
                    System.out.println("3.View Course");
                    System.out.println("4.Create Batch");
                    System.out.println("5.Update Batch");
                    System.out.println("6.View Batch");
                    System.out.println("7.Create Faculty");
                    System.out.println("8.Update Faculty");
                    System.out.println("9.View Faculty");
                    System.out.println("10.Allocate Faculty to Batch");
                    System.out.println("11.Crate CoursePlan");
                    System.out.println("12.Update CoursePlan");
                    System.out.println("13.View CoursePlan");
                    System.out.println("14.View Day wise Update for Every Batch");
                    System.out.println("15.Generate Report for Every Batch");
//                    System.out.println("====================================================");
//                    System.out.println();
                    System.out.print("Enter option :- ");
                    int ato = scanner.nextInt();
                    switch (ato) {
                        case 1:
                            Create_Course.createCourse();
                            break;
                        case 2:
                            Update_Course.updateCourse();
                            break;
                        case 3:
                            View_Course.viewCourse();
                            break;
                        case 4:
                            Create_Batch.createBatch();
                            break;
                        case 5:
                            Update_Batch.updateBatch();
                        case 6:
                            ViewBatch.viewBatch();
                            break;
                        case 7:
                            Insert_Faculty.insertFaculty();
                            break;
                        case 8:
                            Update_Faculty.updateFaculty();
                            break;
                        case 9:
                            View_Faculty.viewFaculty();
                            break;
                        case 10:
                            Allocate_Faculty_InBatch.allocateFacultyInBatch();
                            break;
                        case 11:
                            Create_Course_plan.createCoursePlan();
                            break;
                        case 12:
                            Update_Course_Plan.updateCoursePlan();
                            break;
                        case 13:
                            View_Course_plans.viewCoursePlans();
                            break;
                        case 14:
                            System.out.println("Incomplete");
                            System.out.println("this is view Day wise update for every Batch");
                            break;
                        case 15:
                            System.out.println("Incomplete");
                            System.out.println("This is Generate Report for ever Batch ");
                            break;


                    }
                    //Admin inner switch end----------------------
                }else {
                    System.out.println("Please provide valid details");
                }
                break;
            //------------------------------------------------first case end
            case 2:
                System.out.println("Enter Faculty Id");
                int fid = scanner.nextInt();
                System.out.println("Enter Faculty User Name");
                String fus = scanner.next();
                System.out.println("Enter Faculty Password");
                String fpas = scanner.next();
                Faculty_Dao fd = new Faculty_Dao_Impl();
                boolean fopt = fd.facultyLogin(fus, fpas, fid);
                if (fopt) {
                    System.out.println();
                    System.out.println();
                    System.out.println("Choose Option");
                    System.out.println("1.Update Password");
                    System.out.println("2.View Course Plan");
                    System.out.println("3.Fill_up Day Wise Planer");
                    int fto = scanner.nextInt();
                    switch (fto) {
                        case 1:
                            Update_Faculty_Password.updateFacultyPassword(fid);
                            break;
                        case 2:
                            View_Course_plans.viewCoursePlans();
                            break;
                        case 3:
                            System.out.println("Incomplete");
                            System.out.println("This is fill up day wise planer");
                            break;
                    }
                } else {
                    System.out.println("Please provide Valid Details");
                }


        }
        System.out.println();
        System.out.println("                    <================================= Thank You for Using =================================>");

    }
}
