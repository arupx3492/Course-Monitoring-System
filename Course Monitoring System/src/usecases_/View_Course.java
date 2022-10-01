package usecases_;

import bean_.Course;
import dao_.Course_Dao;
import dao_.Course_Dao_Impl;

import java.util.List;

public class View_Course {

    public static void viewCourse() {
        Course_Dao cd=new Course_Dao_Impl();
        List<Course> courses=cd.viewCourse();

        for(int i=0;i<courses.size();i++) {
            System.out.println(courses.get(i));
        }
    }
}
