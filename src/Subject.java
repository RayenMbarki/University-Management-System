import java.util.List;

public class Subject    {
    private String name;
    private int id;
    private Teacher teacher;

    private List<Student> students;

    public Subject(String name,int id)
    {this.name=name;
    this.id=id;
    }
    public String getSubjectName() {
        return name;
    }

    public int getSubjectId() {
        return id;
    }

    @Override
    public String toString() {
     return "Subject  : " + " subjectName= " + name + " subjectId = " + id ; }


    public void setTeacher(Teacher teacher) {
        this.teacher=teacher;
    }

    public void registerStudent(Student student) {
        boolean check=true;
        for (Student e : students) {
            if (e.getId()==student.getId()) {check=false;}
        }
        if (!check) System.out.println("student " + student.getFirst_name() + " " + student.getLast_name() + " already enrolled");
        else students.add(student);
    }
}

