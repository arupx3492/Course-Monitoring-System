package usecases_;

import bean_.Course;
import dao_.Course_Dao;
import dao_.Course_Dao_Impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Create_Course {
    public static void createCourse() {
        Scanner scanner=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Course Id");
        int ci=scanner.nextInt();
        System.out.println("Enter Course Name");
        String cn=scanner.next();
        System.out.println("Enter fee");
        int cf=scanner.nextInt();
        System.out.println("Enter Course Description");
        String cdes= null;
        try {
            cdes = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Course c1=new Course(ci,cn,cf,cdes);
        Course_Dao cd=new Course_Dao_Impl();
        cd.createCourse(c1);
    }
}
