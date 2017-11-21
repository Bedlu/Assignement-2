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
public class Component {
    private String name;
    private int weight;
    private int grade;
    
    public Component(String name, int weight, int grade) {
        this.name = name;
        this.weight = weight;
        this.grade = grade;
    }
    
    public Component(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.grade = 0;
    }
    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    public String toString(){
        String out = "";
        out += "name: " + this.getName() + ", ";
        out += "weight: " + this.getWeight() + "%, ";
        out += "grade: " + this.getGrade();
        return out;
    }
}
