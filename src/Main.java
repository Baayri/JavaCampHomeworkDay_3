public class Main {
    public static void main(String[] args) {

        Instructor instructor=new Instructor(1,"Esen","Gökçe",
                 "esngkce","123","Java","About");

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.signIn(instructor);
        instructorManager.signUp(instructor);
        instructorManager.logOut(instructor);
        instructorManager.chooseNewCourse(instructor);
        instructorManager.changePassword(instructor);

        System.out.println("");

        Student student=new Student(1,"Turgay","Özgen",
                "trgyozgn","456","Universite","789");

        StudentManager studentManager=new StudentManager();
        studentManager.signIn(student);
        studentManager.signUp(student);
        studentManager.logOut(student);
        studentManager.chooseNewSchool(student);
        studentManager.changePassword(student);



    }
}
