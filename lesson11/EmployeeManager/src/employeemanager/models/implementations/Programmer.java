package employeemanager.models.implementations;

import employeemanager.models.Employee;

public class Programmer extends Employee {

    public Programmer() {
    }

    public Programmer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Programmer(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Programmer(String name, String surname, int yearOfBirth, int idnp) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
    }

    public Programmer(String name, String surname, int yearOfBirth, int idnp, String street, String houseNumber, String apNumber) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apNumber = apNumber;
    }

    @Override
    public void show() {
        System.out.println("Programmer is an employee who writes computer programs");
    }
}
