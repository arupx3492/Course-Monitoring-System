package usecases_;

import bean_.Faculty;
import dao_.Faculty_Dao;
import dao_.Faculty_Dao_Impl;

import java.util.Scanner;

public class Insert_Faculty {

    public static void insertFaculty() {
        Scanner scanner=new Scanner(System.in);
        int fid=scanner.nextInt();
        String fn=scanner.next();
        String fp=scanner.next();
        String fm=scanner.next();
        String fe=scanner.next();
        String un=scanner.next();
        String ps=scanner.next();
        Faculty f1=new Faculty(fid,fn,fp,fm,fe,un,ps);
        Faculty_Dao fd=new Faculty_Dao_Impl();
        fd.registerFaculty(f1);
    }
}
