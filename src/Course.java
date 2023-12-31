import java.util.ArrayList;

public class Course {
    private String id;
    private Teacher teacher;
    private ClassRoom room;
    private Subject subject;
    private ArrayList <Student> students_in;
    private  ArrayList <Exam> examens;


    public Course(String course_id, Teacher teacher, Subject subject, ArrayList<Student> students, ClassRoom c,ArrayList<Exam> examens) {
        this.id = course_id;
        this.teacher = teacher;
        this.subject = subject;
        this.students_in = students;
        this.examens = examens;
        room = c;
    }

    public void registerStudent(Student s) {
        boolean check=true;
        for (Student e : students_in) {
            if (e.getId()==s.getId()) {check=false;}
            }
        if (!check) System.out.println("student " + s.getFirst_name() + " " + s.getLast_name() + " already enrolled");
        else students_in.add(s);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void add_Exam(Exam e) {
        boolean check=true;
        for (Exam s : examens) {
            if (s.getExamName().equalsIgnoreCase(e.getExamName())) {check=false;}
        }
        if (!check) System.out.println("examen " + e.getExamName()  + " already designed for this course");
        else examens.add(e);
    }

  public String getCourseId() {
      return id;
    }


    @Override
    public String toString() {
        return "Course : " +  this.id + "  course_Id  -----  teacher : " + teacher.getFirst_name() + " " + teacher.getLast_name() + " ------- subject : " + subject.getSubjectName();
    }

    public void displayStudnts()
    {
        System.out.println("participated students in course  of : " + subject.getSubjectName() + " are : " );
        for (Student s:students_in) {
            System.out.println( "   Student : " + s.toString() );
        }

    }
}
