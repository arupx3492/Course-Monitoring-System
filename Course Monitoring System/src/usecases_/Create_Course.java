package usecases_;

import bean_.Course;
import dao_.Course_Dao;
import dao_.Course_Dao_Impl;

public class Create_Course {
    public static void main(String[] args) {
        Course c1=new Course(100,"java",35000,"This is Java backend course");
        Course_Dao cd=new Course_Dao_Impl();
        cd.createCourse(c1);
    }
}
