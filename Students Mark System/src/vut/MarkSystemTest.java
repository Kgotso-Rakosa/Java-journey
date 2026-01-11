
package vut;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author KGOTSO
 */
public class MarkSystemTest {

    public static void main(String[] args) {
        //variables
        String pattern="EEEE/MMMM/yyyy HH:mm aa";
        String studentName="";
        String[] moduleName=new String[Students.FIVE];
        double[] studentMark=new double[Students.FIVE];
        
        // java classes
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        GregorianCalendar date=new GregorianCalendar();
        Scanner input=new Scanner(System.in);
        
        //display date 
        System.out.println("Date: "+ format.format(date.getTime()));
        
        //get user input
        System.out.print("Enter student name: ");
        studentName=input.nextLine();
        
        for(int i=0;i<Students.FIVE;i++){
            System.out.print((i+1)+ ". Enter module name "+ (i+1)+": ");
            moduleName[i]=input.nextLine();
            
            while(true){
                    System.out.print("Enter "+ moduleName[i]+" mark: ");
                    studentMark[i]=input.nextDouble(); 
                    
                    if (studentMark[i]>=0 && studentMark[i]<=100){
                        break;
                    }else{
                        System.out.println("Mark must be in between 0-100");
                    }
            }

            //clear the scanner
            input.nextLine();
            //skip a line
            System.out.print("\n");
        }
        
        System.out.println("------------------INPUT COLLECTION COMPLETE--------------------");
        
        //students object
        Students objStudent=new Students(studentName, moduleName, studentMark);
        
        //call dislay method
        objStudent.processMarks(moduleName, studentMark);
        
    }
    
}
