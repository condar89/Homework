package employeemanager.models.implementations;

import employeemanager.models.Employee;

public class Technician extends Employee {

    public Technician() {
    }

    public Technician(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Technician(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Technician(String name, String surname, int yearOfBirth, int idnp) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
    }

    public Technician(String name, String surname, int yearOfBirth, int idnp, String street, String houseNumber, String apNumber) {
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
        System.out.println("Thehnician is a person employed to look after technical equipment or do practical work in a laboratory");
    }
}
