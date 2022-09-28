package usecases_;

import bean_.Faculty;
import dao_.Faculty_Dao;
import dao_.Faculty_Dao_Impl;

public class Insert_Faculty {

    public static void main(String[] args) {
        Faculty f1=new Faculty(100,"Arup Mahato","Kolkata","9883692791","arup71062@gmail.com","6649","S6649");
        Faculty_Dao fd=new Faculty_Dao_Impl();
        fd.registerFaculty(f1);
    }
}
