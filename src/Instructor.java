public class Instructor extends User{

    private String courseName;
    private String about;

    public Instructor(){

    }

    public Instructor(int id, String firstName, String lastName, String userName, String password, String courseName, String about) {
        super(id, firstName, lastName, userName, password);
        this.setCourseName(courseName);
        this.setAbout(about);
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
