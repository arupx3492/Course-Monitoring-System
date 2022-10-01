package usecases_;

import dao_.Course_Dao;
import dao_.Course_Dao_Impl;

import java.util.Scanner;

public class Update_Course {

    public static void updateCourse() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Course Id");
        int  c_id=scanner.nextInt();
        System.out.println("What you want to update");
        System.out.println("1.Course Name");
        System.out.println("2.Fee");
        System.out.println("3.Course Description");
        int upd=scanner.nextInt();
        String f;
        if(upd==1){
            f="courseName";
        }else if(upd==2){
            f="Fee";
        } else{
            f="courseDescription";
        }

        System.out.println("Enter the Updated value");
        String s=scanner.next();



        Course_Dao cd=new Course_Dao_Impl();
        cd.updateCourse(c_id,f,s);
    }

}
