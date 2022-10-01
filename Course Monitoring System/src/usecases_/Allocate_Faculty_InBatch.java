package usecases_;

import dao_.Batch_Dao;
import dao_.Batch_Dao_Impl;

import java.util.Scanner;

public class Allocate_Faculty_InBatch {

    public static void allocateFacultyInBatch() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter batch id where you want to allocate faculty");
        int bi=scanner.nextInt();
        System.out.println("Enter the batchId");
        int fi=scanner.nextInt();

        Batch_Dao bd=new Batch_Dao_Impl();
        bd.allocateFacultyInBatch(bi,fi);
    }
}
