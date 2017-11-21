/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypea2;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Student extends Person{
    int studentNum;
    ArrayList<Module> modules = new ArrayList<Module>();
    
    public Student(String firstName, String surname, int studentNum) {
        super(firstName, surname);
        this.studentNum = studentNum;
    }
    
    public void enroll(Module module) {
        modules.add(new Module(module.getName(),module.getCode(),module.getCoordinator()));
    }
    
    public String viewModules() {
        String out = "";
        out += this.getFirstName() + "'s Modules \n";
        for(Module elem : modules) {
            out += elem.toString() + "\n";
        }
        return out;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }
    
}
