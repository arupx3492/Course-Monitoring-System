package dao_;

import bean_.Course;
import bean_.CoursePlan;

import java.util.List;

public interface Course_plan_Dao {

    public void createCoursePlan(CoursePlan c);


    public List<CoursePlan> viewCoursePlans();


    public void updateCoursePlan(int pi, String f, String s);
}
