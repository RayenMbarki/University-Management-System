import java.util.ArrayList;
import java.util.List;
public class Clubs {
    private String club_name;
    private List<Student> c;

    public Clubs(String name) {
        club_name = name;
        c = new ArrayList<>();
    }

    public String getClubName() {
        return club_name;
    }

    public void addMember(Student s) {
        c.add(s);
    }

    public void removeMember(Student s) {
        c.remove(s);
    }

    public List<Student> getMembers() {
        return c;
    }

    @Override
    public String toString() {
        for (Student p : c) {
            System.out.println(p);}
        return null;
    }
}
