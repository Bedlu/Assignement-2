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
public class Module {
    private String name;
    private String code;
    private StaffMember coordinator;
    private int grade;
    ArrayList<Component> components = new ArrayList<Component>();
    
    public Module(String name, String code, StaffMember coordinator) {
        this.name = name;
        this.code = code;
        this.coordinator = coordinator;
    }
    
    public void addComponent(String name, int weight) {
        Component tmp = new Component(name,weight);
        if(componentCheck(tmp)) {
            components.add(new Component(name,weight));
        }
        else {
            System.out.println("Cannot add component, weightSum > 100");
        }
        
    }
    public void addComponent(Component a) {
        components.add(a);
    }
    
    public void calculateGrade() {
        
    }
    public boolean componentCheck(Component a){
        int sum = 0;
        for(Component elem : components) {
            sum += elem.getWeight();
        }
        if(sum + a.getWeight() > 100) {
            return false;
        }
        else {
            return true;
        }
    }
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public StaffMember getCoordinator() {
        return coordinator;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCoordinator(StaffMember coordinator) {
        this.coordinator = coordinator;
    }
    
    public String toString() {
        String out = "";
        out += "Module code: " + this.getCode() + ", name: " + this.getName() + ", coordinator: " + this.getCoordinator().toString() + "\n";
        out += "Components: ";
        for(Component elem : components) {
            out += elem.toString() + ". ";
        }
        return out;
    }
}
