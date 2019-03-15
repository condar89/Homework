package employeemanager.models;

public abstract class Employee {

    public String name;
    public String surname;
    public int yearOfBirth;
    public int idnp;
    public String street;
    public String houseNumber;
    public String apNumber;

    public abstract void show();

}
