package onehundredclasses.Employee;

public class Tehnician {

    public String name;
    public String surname;
    public int yearOfBirth;
    public int idnp;
    public String street;
    public String houseNumber;
    public String apNumber;
public void work(){
            System.out.println("Technician is a person employed to look after technical equipment or do practical work");
}
public void repare(boolean brokentechnic){
    if (brokentechnic)
        System.out.println("The technician will repare it");
    else {
        System.out.println("The technician will do a technical revision to maintain the technic");
    }
}
}
