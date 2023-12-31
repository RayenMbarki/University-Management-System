import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private String department;
    private List<Subject> courses;

    public Teacher(String first_name, String last_name,  int age,String department,Subject course) {
        super(first_name, last_name,age);
        this.department = department;
        this.courses=new ArrayList<>();
        courses.add(course);
    }

    public String getDepartment() {
        return department;
    }


    public void affiche_courses() {
        System.out.println("TEACHER " + this.getFirst_name() + " " + this.getLast_name() + " teach courses : ");
        for (Subject c:courses) {
            System.out.println(c.toString());
        }
    }


    public void teach_course(Subject c){
        courses.add(c);
        c.setTeacher(this);
    }

}
