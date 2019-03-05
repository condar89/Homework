package employeemanager.models.implementations;

import employeemanager.models.Employee;

public class Salesman extends Employee {

    public Salesman() {
    }

    public Salesman(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Salesman(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Salesman(String name, String surname, int yearOfBirth, int idnp) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
    }

    public Salesman(String name, String surname, int yearOfBirth, int idnp, String street, String houseNumber, String apNumber) {
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
        System.out.println("Salesman is an employee whose job involves selling or promoting commercial products");
    }

}
