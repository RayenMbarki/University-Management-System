import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int id;
    private String Speciality;
    private List<Subject> courses;

    public Student(String first_name, String last_name,  int age, int id , String Speciality) {
        super(first_name, last_name, age);
        courses=new ArrayList<>();
        this.id=id;
        this.Speciality=Speciality;

    }

    public void add_course(Subject c) {
        courses.add(c);
        c.registerStudent(this);
    }

    public void all_courses() {
        System.out.println("student " + this.getFirst_name() + " " + this.getLast_name() + " pursue courses : ");
        for (Subject c : courses) {
            System.out.println(c.toString());
        }
    }
    public int getId() {
        return id;
    }
    public String getSpeciality() {
        return Speciality;
    }


}
