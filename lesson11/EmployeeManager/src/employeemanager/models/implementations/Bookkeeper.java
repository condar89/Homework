package employeemanager.models.implementations;

import employeemanager.models.Employee;

public class Bookkeeper extends Employee {

    public Bookkeeper() {
    }

    public Bookkeeper(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Bookkeeper(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Bookkeeper(String name, String surname, int yearOfBirth, int idnp) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
    }

    public Bookkeeper(String name, String surname, int yearOfBirth, int idnp, String street, String houseNumber, String apNumber) {
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
        System.out.println("Bookkeeper works is to keep records of the financial affairs of the busines.");
    }

}
