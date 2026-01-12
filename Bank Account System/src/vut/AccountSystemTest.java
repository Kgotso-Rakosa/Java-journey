
package vut;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author KGOTSO
 */
public class AccountSystemTest {

    public static void main(String[] args) {
        //variables 
        String pattern=" EEEE(dd)/MMMM/yyyy HH:mm aa";
        String usersInput,accountHolder;
        double depositAmount=0.0,withdrawalAmount=0.0;
        
        //constants
        final String ONE="1";
        final String TWO="2";
        final String THREE="3";
        final String FOUR="4";
        final String FIVE="5";
        
        //java classes
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        GregorianCalendar date= new GregorianCalendar();
        Scanner input=new Scanner(System.in);
        
        //Account class
        Account objAccount=new Account();
        
        //display date 
        System.out.println("Date: "+ format.format(date.getTime()));
        
        do{
            //input
            System.out.println("Welcome to Kgotso's Bank.Pick one of the following services.\n Enter the number only: ");
        
            System.out.println(" 1.Deposit: \n 2.Withdraw: \n 3.Show balance. \n 4.Set account. \n 5.Exit. \n");
        
            System.out.print("Choice: "); 
            usersInput=input.nextLine();
            
                    
            if(usersInput.equalsIgnoreCase(ONE)){
                System.out.print("Enter Deposit amount: R ");
                depositAmount=input.nextDouble();
                objAccount.makeDeposit(depositAmount);
                input.nextLine();
            }else if(usersInput.equalsIgnoreCase(TWO)){
                System.out.print("Enter Withdrawal amount: R ");
                withdrawalAmount=input.nextDouble();
                objAccount.makeWithdrawal(withdrawalAmount);
                input.nextLine();
            }else if(usersInput.equalsIgnoreCase(THREE)){
                System.out.printf("Balance: R %10.2f \n",objAccount.getAccountBalance());
            }else if(usersInput.equalsIgnoreCase(FOUR)){
                System.out.print("Enter Account Holder: ");
                accountHolder=input.nextLine();
                objAccount.setAccountHolder(accountHolder);
                
            }else if(usersInput.equalsIgnoreCase(FIVE)){
                System.out.println("Thank you for using Kgotso's Banking system.");
                break;
            }else{
                System.out.println("Incorrect input.");
            }

        }while(!usersInput.equals(FIVE));
    }
    
}
