public class AdministrationEmployee extends Person {
    private String responsability;

    public AdministrationEmployee(String first_name, String last_name, int age, String responsability) {
        super(first_name, last_name, age);
        this.responsability = responsability;
    }

    public String getResponsability() {
        return responsability;
    }
}
