/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypea2;

/**
 *
 * @author Administrator
 */
public class StaffMember extends Person{
    
    public StaffMember(String firstName, String surname) {
        super(firstName, surname);
    }
    public void setComponentGrade(Student student, Module module, Component component, int grade) {
        if(student.getModules().contains(module)) {
            if(module.getComponents().contains(component)) {
                for(int i = 0; i < student.getModules().size(); i++) {
                    if(student.getModules().get(i) == module){
                        for(int j = 0; j < student.getModules().get(i).getComponents().size(); j++) {
                            if( student.getModules().get(i).getComponents().get(j) == component){
                                student.getModules().get(i).getComponents().get(j).setGrade(grade);
                            }
                        }
                    }
                }
            }
        }
    }
    public String toString() {
        String out = "";
        out += "" + this.getFirstName() + " " + this.getSurname();
        return out;
    }
    
}
