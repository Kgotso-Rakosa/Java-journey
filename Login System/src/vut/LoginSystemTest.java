
package vut;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author KGOTSO
 */
public class LoginSystemTest {

    public static void main(String[] args) {
        //variables
        String pattern="EEEE(dd)/MMMM/yyyy HH:mm aa";
        String userName="";
        String passWord="",checkPassWord="";
        int attempts=0;
        
        //Constant
        final int THREE=3;
        
        //java classes
        GregorianCalendar date=new GregorianCalendar();
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        Scanner input=new Scanner(System.in);
        
        //display date
        System.out.println("Date: "+ format.format(date.getTime()));
        
        System.out.print("Enter Username: ");
        userName=input.nextLine();
        
        while(true){
        
            System.out.print("Set Password: ");
            passWord=input.nextLine();
        
            System.out.print("Repeat password: ");
            checkPassWord=input.nextLine();
        
            if(passWord.equalsIgnoreCase(checkPassWord)){
                break;
            }else{
                System.out.println("Passwords do not match.Repeat process");
            }
        }
        
        Login objLogin=new Login(userName, passWord);
        
        System.out.println("-----------------INPUT COMPLETE-------------------");
        System.out.println("-----------------SIGN IN------------------");
        
        
        while(attempts<THREE){
            
            System.out.println("Username: ");
            userName=input.nextLine();
            
            System.out.println("Password: ");
            passWord=input.nextLine();
            
            if(objLogin.validateInput(userName, passWord)){
                System.out.println("Acces Granted");
                break;
            }else{
                attempts++;
                System.out.println("Invalid input. Please try again. "+(THREE-attempts)+" attempts left.");
            }
              
        }
        
        
        
    }
    
}
