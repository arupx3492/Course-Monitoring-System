package usecases_;

import bean_.Faculty;
import dao_.Faculty_Dao;
import dao_.Faculty_Dao_Impl;
import exception_.Faculty_Exception;

import java.util.List;

public class View_Faculty {

    public static void viewFaculty() {
        Faculty_Dao fd = new Faculty_Dao_Impl();
        try {
            List<Faculty> flist = fd.viewFaculty();
            for (int i = 0; i < flist.size(); i++) {
                System.out.println(flist.get(i));
                System.out.println("=========================================");
            }

        } catch (Faculty_Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
