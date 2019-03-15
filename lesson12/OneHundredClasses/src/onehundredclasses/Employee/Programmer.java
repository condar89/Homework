package onehundredclasses.Employee;

public class Programmer {

    public String name;
    public String surname;
    public int yearOfBirth;
    public int idnp;
    public String street;
    public String houseNumber;
    public String apNumber;

    public void work() {
        System.out.println("Programmer write code");
    }

    public void code(boolean goodcode, int caseType) {
        switch (caseType) {
            case 1:
                goodcode = true;
                System.out.println("Yor code works");
            case 2:
                goodcode = false;
                System.out.println("Find a solution");
        }
    }
}
