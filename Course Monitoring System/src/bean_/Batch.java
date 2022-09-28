package bean_;

public class Batch {

    private int batchId;
    private int courseId;
    private int facultyId;
    private int numberOfCourses;
    private String batchStartDate;
    private String duration;

    public Batch() {
    }

    public Batch(int batchId, int courseId, int facultyId, int numberOfCourses, String batchStartDate, String duration) {
        this.batchId = batchId;
        this.courseId = courseId;
        this.facultyId = facultyId;
        this.numberOfCourses = numberOfCourses;
        this.batchStartDate = batchStartDate;
        this.duration = duration;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public String getBatchStartDate() {
        return batchStartDate;
    }

    public void setBatchStartDate(String batchStartDate) {
        this.batchStartDate = batchStartDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", courseId=" + courseId +
                ", facultyId=" + facultyId +
                ", numberOfCourses=" + numberOfCourses +
                ", batchStartDate='" + batchStartDate + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
