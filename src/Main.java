import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        Subject mathematics = new Subject("Mathematics", 1);
        Subject physics = new Subject("Physics", 2);


        Teacher mathTeacher = new Teacher("Ali", "Hammami", 35, "Mathematics", mathematics);
        Teacher physicsTeacher = new Teacher("Sami", "Dridi", 40, "Physics", physics);


        Student student1 = new Student("rayen", "mbarki", 20, 101, "Software Engineering");
        Student student2 = new Student("iyed", "mbarki", 18, 102, "Maths");


        ClassRoom class11 = new ClassRoom();


        Course mathCourse = new Course("MATH11", mathTeacher, mathematics, new ArrayList<>(List.of(student1)), class11, new ArrayList<>());
        Course physicsCourse = new Course("PHYS11", physicsTeacher, physics, new ArrayList<>(List.of(student2)), class11, new ArrayList<>());


        Exam mathExam = new Exam("Math Exam", "Advanced", mathCourse);
        Exam physicsExam = new Exam("Physics Exam", "Intermediate", physicsCourse);
        mathCourse.add_Exam(mathExam);
        physicsCourse.add_Exam(physicsExam);


        Clubs mathClub = new Clubs("Math Club");
        mathClub.addMember(student1);
        mathClub.addMember(student2);

        AdministrationEmployee adminEmployee = new AdministrationEmployee("SABER", "BOUZAIDA", 30, "Admin ");


        Map<String, String[][]> timetableData = new HashMap<>();
        TimeSheet timetable = new TimeSheet(timetableData);


        timetable.add_course_to_calendar(mathCourse, new String[][]{
                {"8:00 AM - 10:00 AM", "Monday"},
                {"10:00 AM - 12:00 PM", "Wednesday"}
        });
        timetable.add_course_to_calendar(physicsCourse, new String[][]{
                {"1:00 PM - 3:00 PM", "Tuesday"},
                {"3:00 PM - 5:00 PM", "Thursday"}
        });


        timetable.get_timetable();


        mathCourse.displayStudnts();
        physicsCourse.displayStudnts();


        System.out.println("Members of " + mathClub.getClubName() + ":");
        mathClub.toString();


        System.out.println(adminEmployee.getFirst_name() + " " + adminEmployee.getLast_name() + " is responsible for " + adminEmployee.getResponsability());

    }
}