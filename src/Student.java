public class Student extends User{

    private String schoolName;
    private String studentNumber;

    public Student(){

    }

    public Student(int id, String firstName, String lastName, String userName, String password, String schoolName, String studentNumber) {
        super(id, firstName, lastName, userName, password);
        this.setSchoolName(schoolName);
        this.setStudentNumber(studentNumber);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
