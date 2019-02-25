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
public class Manager extends Employee {

    public Manager() {
    }

    public Manager(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Manager(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Manager(String name, String surname, int yearOfBirth, int idnp) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
    }

    public Manager(String name, String surname, int yearOfBirth, int idnp, String street, String houseNumber, String apNumber) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.idnp = idnp;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apNumber = apNumber;
    }

}
