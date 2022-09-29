package dao_;

import bean_.Faculty;
import exception_.Faculty_Exception;

import java.util.List;

public interface Faculty_Dao {

    public void registerFaculty(Faculty faculty);
    public void UpdateFaculty(String s);

    public List<Faculty> viewFaculty() throws Faculty_Exception;

}
