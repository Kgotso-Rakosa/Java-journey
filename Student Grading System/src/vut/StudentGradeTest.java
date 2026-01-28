package vut;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * i'll be testing the Student class
 *
 * @author KGOTSO
 */
public class StudentGradeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables 
        String pattern = "EEEE(dd)/MMMM/yyyy HH:mm aa";
        String[] moduleNames = new String[Student.FIVE];
        double[] marks = new double[Student.FIVE];
        String studentName = "";
        String studentId = "";

        //constants
        final int EIGHT = 8;

        //java classes
        GregorianCalendar date = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        //display date 
        System.out.println("Date: " + format.format(date.getTime()));

        //tester obj
        StudentGradeTest objTest = new StudentGradeTest();

        //get input
        objTest.getUserInput(input, studentName, studentId, moduleNames, marks);

        //create a Student obj and add it to studentList
        Student objOne = new Student(studentId, studentName, moduleNames, marks);

        //add objThando to arrayList
        studentList.add(objOne);

        //ask user for another set of input
        objTest.getUserInput(input, studentName, studentId, moduleNames, marks);

        //create Student obj 
        Student objTwo = new Student(studentId, studentName, moduleNames, marks);

        //add objMpho to studentList
        studentList.add(objTwo);

        //ask user for another set of input
        objTest.getUserInput(input, studentName, studentId, moduleNames, marks);

        //create Student obj 
        Student objThree = new Student(studentId, studentName, moduleNames, marks);

        //add objMpho to studentList
        studentList.add(objThree);
        
        //display average,results,and student names for each student 
        
        for(Student objRef:studentList){
            objRef.display();
        }
        
    }

    public void getUserInput(Scanner input, String studentName, String studentId, String[] moduleNames, double[] marks) {

        //constant
        final int EIGHT = 8;

        //get user input
        System.out.print("Student Name: ");
        studentName = input.nextLine();

        while (true) {

            System.out.print("Student ID: ");
            studentId = input.nextLine();

            if (studentId.length() == EIGHT) {
                break;
            } else {
                System.out.println("ID must be " + EIGHT + " characters long.");
            }

        }

        //skip line
        System.out.println("");

        for (int i = 0; i < Student.FIVE; i++) {

            System.out.print((i + 1) + ". Module Name: ");
            moduleNames[i] = input.nextLine();

            System.out.print((i + 1) + ".1. " + moduleNames[i] + " mark: ");
            marks[i] = input.nextDouble();

            input.nextLine();//clear scanner after get number

            System.out.println();

        }

    }

}
