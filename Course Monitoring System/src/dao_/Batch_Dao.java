package dao_;

import bean_.Batch;

import java.util.List;

public interface Batch_Dao {

    public void createBatch(Batch batch);


    public List<Batch> viewCourse();


    public void   updateBatch(int bi,String f, String s);
}
