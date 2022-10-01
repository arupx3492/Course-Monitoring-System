package usecases_;

import dao_.Faculty_Dao;
import dao_.Faculty_Dao_Impl;

import java.util.Scanner;

public class Update_Faculty {

    public static void updateFaculty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Faculty Id");
        int  f_id=scanner.nextInt();
        System.out.println("What you want to update");
        System.out.println("1.Faculty Name");
        System.out.println("2.Faculty Address");
        System.out.println("3.Mobile");
        System.out.println("4.Email");
        System.out.println("5.User Name");
        System.out.println("6.Password");
        int upd=scanner.nextInt();
        String f;
        if(upd==1){
            f="facultyId";
        }else if(upd==2){
            f="facultyAddress";
        } else if (upd==3) {
            f="mobile";
        }else if (upd==4){
            f="email";
        }else if (upd==5){
            f="userName";
        } else{
            f="password";
        }

        System.out.println("Enter the Updated value");
        String s=scanner.next();

        Faculty_Dao fd=new Faculty_Dao_Impl();
        fd.updateFaculty(f_id,f,s);
    }
}
