/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.models.implementations;

import employeemanager.models.Employee;

/**
 *
 * @author 37367
 */
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

    public void show() {
        System.out.println("This class show the information Programmer that whork in company");
    }

    public void dispay(String name, String surname, int yearOfBirth, int idnp, String street, String houseNumber, String apNumber) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apNumber = apNumber;
        System.out.print("Programmer");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(yearOfBirth);
        System.out.println(idnp);
        System.out.println(street);
        System.out.println(houseNumber);
        System.out.println(apNumber);
    }
}
