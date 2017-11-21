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
public class PrototypeA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaffMember liam = new StaffMember("Liam","ORielly");
        StaffMember oliver = new StaffMember("Oliver","Kullmann");
        
        Module seng = new Module("Software Engineering", "CS-230",liam);
        Module algorithms = new Module("Algorithms", "CS-270",oliver);
        
        Student martin = new Student("Martin", "Sparstad", 919075);
        Student nitram = new Student("Nitram", "Sparstad", 570919);
        
        martin.enroll(seng);
        martin.enroll(algorithms);
        
        nitram.enroll(algorithms);
        
        Component A1 = new Component("A1", 30, 5);
        Component A2 = new Component("A2", 30, 5);
        Component A3 = new Component("A3", 40, 5);
        
        seng.addComponent(A1);
        seng.addComponent(A2);
        seng.addComponent(A3);
        
        algorithms.addComponent(A1);
        
        liam.setComponentGrade(martin, seng, A3, 99);
        System.out.println(martin.viewModules());
        
        System.out.println(A1.toString());
        System.out.println(seng.toString());
    }    
}
