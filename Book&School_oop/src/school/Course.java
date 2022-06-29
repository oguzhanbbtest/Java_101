package school;
public class Course {
    private String courseName;
    private String code;
    private Instructor instructor;

    public Course(String courseName, String code, Instructor instructor) {
        this.courseName = courseName;
        this.code = code;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public double calAvarage(Student[] students){ // Course sınıfına ait bir metotta farklı sınıftan bir nesne üretiliyorsa bağımlılık diyoruz
        double avarage = 0.0;                     // burda "uses a" sınıf ilişkisi uygulamış olduk "bağımlılık"
        for (Student student : students) {
            avarage += student.getNote();
        }
        return avarage/students.length;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
