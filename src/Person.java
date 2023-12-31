public class Person {
    private String first_name, last_name;
    private int age;

    public Person(String first_name, String last_name,  int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;

    }


    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }



    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" + "first_name='" + first_name + " , last_name = " + last_name+  ", age=" + age  +   '}';

    }
}