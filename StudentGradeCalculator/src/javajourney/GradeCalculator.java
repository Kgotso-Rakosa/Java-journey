
package javajourney;

import java.util.Scanner;

/**
 *
 * @author KGOTSO
 */
public class GradeCalculator {


    public static void main(String[] args) {
        //declare variables
        String name;
        double mark1,mark2,mark3,average;
        
        //declare scanner
        Scanner input=new Scanner(System.in);
        
        //get user info
        System.out.print("Enter your name: ");
        name=input.nextLine();
        
        while (true) {            
        System.out.println("Enter mark 1: ");
        mark1=input.nextDouble(); 
        
            if (mark1 <= 100) {
                break;
            }
            System.out.println("Mark cannot exceed 100");
        }
        
        while (true) {            
        System.out.println("Enter mark 2: ");
        mark2=input.nextDouble();  
        
            if (mark2 <= 100) {
                break;
            }
            System.out.println("Mark cannot exceed 100");
        }
        
        while (true) {            
        System.out.println("Enter mark 3: ");
        mark3=input.nextDouble();
        
            if (mark3 <= 100) {
                break;
            }
            System.out.println("Mark cannot exceed 100");
        }
        
        
        //create a obj
        Student objStudent=new Student(name, mark1, mark2, mark3);
        
        //call calculate method
        average=objStudent.calcAverage(mark1, mark2, mark3);
        
        //display average
        System.out.println("Average= "+ average+ "%");
        objStudent.displayResult();
       
    }
    
}
