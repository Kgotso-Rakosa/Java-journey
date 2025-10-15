
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
        double mark1,mark2,mark3;
        
        //declare scanner
        Scanner input=new Scanner(System.in);
        
        //get user info
        System.out.println("Enter your name: ");
        name=input.nextLine();
        
        System.out.println("Enter mark 1: ");
        mark1=input.nextInt();
    }
    
}
