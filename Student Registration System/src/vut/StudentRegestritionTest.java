package vut;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author KGOTSO
 */
public class StudentRegestritionTest {

    public static void main(String[] args) {

        //variables
        String pattern = " EEEE(dd)/MMMM(MM)/yyyy HH:mm aa";
        String inputNumber = "0";
        String studentName = " ", studentId = " ", course = " ";
        String searchId = " ";

        //constants
        final String ONE = "1", TWO = "2", THREE = "3", FOUR = "4";

        //java classes 
        Scanner input = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat(pattern);

        GregorianCalendar date = new GregorianCalendar();

        ArrayList<Student> studentList = new ArrayList<Student>();

        //display date 
        System.out.println("Date: " + format.format(date.getTime()));

        System.out.println("Welcome to Wisemen High Regestrition. Pick a number from the avaible services");

        //get input
        System.out.println("1.Register Student. \n2.View Registered Students. \n3.Search Student by Id. \n4.Exit.\n");

        do {

            System.out.print("Enter number to desired service: ");
            inputNumber = input.nextLine();
            System.out.println("\n");

            if (inputNumber.equalsIgnoreCase(ONE)) {

                //register students
                System.out.print("Enter Student Name: ");
                studentName = input.nextLine();

                System.out.print("Enter Student ID: ");
                studentId = input.nextLine();

                System.out.print("Enter course: ");
                course = input.nextLine();

                System.out.println("\n");
                //create Student obj
                Student objStudent = new Student(studentId, studentName, course);

                //use studentList to add student
                studentList.add(objStudent);

                //response msg
                System.out.println(objStudent.getStudentName() + " has been registered.\n");

            } else if (inputNumber.equalsIgnoreCase(TWO)) {

                //view all add students
                for (int i = 0; i < studentList.size(); i++) {
                    Student studentReference = studentList.get(i);//get student objs from the arraylist and store the memory locations to student reference

                    System.out.println((i + 1) + studentReference.toString());
                }

            } else if (inputNumber.equalsIgnoreCase(THREE)) {

                //search student by id
                System.out.println("Enter Student ID to search: ");
                searchId = input.nextLine();

                for (Student studentRefernce : studentList) {

                    //compare IDs
                    if (searchId.equalsIgnoreCase(studentRefernce.getStudentId())) {
                        System.out.println(studentRefernce.toString());
                        break;
                    }
                    
                    if (!searchId.equalsIgnoreCase(studentRefernce.getStudentId())) {
                        System.out.print("ID does not match any stored ID's.\n");
                    }
                 
                }

            } else if (inputNumber.equalsIgnoreCase(FOUR)) {

                System.out.println("Thank you for using my Registeration System.\n");

            } else {

                System.out.println("Invalid input. Enter 1-4 ONLY.");

            }

        } while (!inputNumber.equalsIgnoreCase(FOUR));

    }

}
