package usecases_;

import bean_.Batch;
import dao_.Batch_Dao;
import dao_.Batch_Dao_Impl;

import java.util.Scanner;

public class Create_Batch {

    public static void createBatch() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Batch ID");
        int b_id=scanner.nextInt();
        System.out.println("Enter course ID");
        int c_id=scanner.nextInt();
        System.out.println("Enter Faculty ID");
        int f_id=scanner.nextInt();
        System.out.println("Enter Number of Student");
        int NOS=scanner.nextInt();
        System.out.println("Enter the batch starting date ini  YYYY-MM-DD  format");
        String date=scanner.next();
        System.out.println("Enter the Course Duration");
        String duration=scanner.next();

        Batch b1=new Batch(b_id,c_id,f_id,NOS,date,duration);
        Batch_Dao bd=new Batch_Dao_Impl();
        bd.createBatch(b1);
    }
}
