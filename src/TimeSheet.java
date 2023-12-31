import java.util.Arrays;
import java.util.Map;


public class TimeSheet {

    private Map<String, String[][]> timeSheet;


    public TimeSheet(Map<String, String[][]> timeSheet) {
        this.timeSheet = timeSheet;
    }

    public void add_course_to_calendar(Course c,String[][] time) {
            if (!timeSheet.containsKey(c.getCourseId())) {
                timeSheet.put(c.getCourseId(),time);
            }
        else System.out.println(" course having id : [ " + c.getCourseId() + " ] already defined on the timetable ");

    }

    public void get_timetable()
    {
        System.out.println("YOUR UNIVERSITY TIMETABLE : ");
        for (Map.Entry<String, String[][]> entry : timeSheet.entrySet()) {
            String id = entry.getKey();
            String[][] time = entry.getValue();

            System.out.println("Course id : " + id);
            System.out.println("Course time :");

            for (String[] daySchedule : time) {
                for (int i = 0; i < daySchedule.length; i++) {
                    System.out.print("Day " + (Arrays.asList(time).indexOf(daySchedule) + 1) + ": ");
                    System.out.print(daySchedule[i] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}
