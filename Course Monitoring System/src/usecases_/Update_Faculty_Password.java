package usecases_;

import dao_.Faculty_Dao;
import dao_.Faculty_Dao_Impl;

import java.util.Scanner;

public class Update_Faculty_Password {

    public static void updateFacultyPassword(int fid) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the Faculty Id");
//        int fi=scanner.nextInt();
        System.out.println("Enter the new Password");
        String np=scanner.next();


        Faculty_Dao fd=new Faculty_Dao_Impl();
        fd.updateFacultyPassword(fid,np);
    }
}
