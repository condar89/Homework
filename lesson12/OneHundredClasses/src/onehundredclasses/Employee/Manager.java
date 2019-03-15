package onehundredclasses.Employee;

public class Manager {

    public String name;
    public String surname;
    public int yearOfBirth;
    public int idnp;
    public String street;
    public String houseNumber;
    public String apNumber;

    public void work() {
        System.out.println("Manager is responsible for controlling or administering an organization or group of staff");
    }

    public void decision(String decision, boolean factors) {
        if (factors) {
            System.out.println(decision + "positive");
        } else {
            System.out.println(decision + "negative");
        }
    }
}
