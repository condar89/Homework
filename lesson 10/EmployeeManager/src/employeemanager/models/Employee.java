/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanager.models;

/**
 *
 * @author 37367
 */
public class Employee {


    public String protectedname;
    public String publicsurname;
    public int privetage;
    
    void display (){
        Employee x = new Employee(); 
            System.out.println("Hello, I am a new " + x);
}

}
