package usecases_;

import dao_.Batch_Dao;
import dao_.Batch_Dao_Impl;

import java.util.Scanner;

public class Update_Batch {

    public static void updateBatch() {
           Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Batch Id");
        int  b_id=scanner.nextInt();
        System.out.println("What you want to update");
        System.out.println("1.Course Id");
        System.out.println("2. Faculty Id");
        System.out.println("3. Number OF Student");
        System.out.println("4.Batch Started date");
        System.out.println("5.Duration");
        int upd=scanner.nextInt();
        String f;
        if(upd==1){
            f="courseId";
        }else if(upd==2){
            f="FaultyId";
        }else if(upd==3){
            f="numberOfStudent";
        }else if(upd==4){
            f="BatchStartDate";
        } else{
            f="duration";
        }
        System.out.println("Enter The Updated value");
        String s=scanner.next();
        Batch_Dao bd=new Batch_Dao_Impl();
        bd.updateBatch(b_id,f,s);
    }
}
