                            
package vut;

/**
 *
 * @author KGOTSO
 */
public class Account {
    //instance variables
    private String accountNumber;
    private String accountHolder;
    private double accountBalance=100.0;
    
    //default constructor
    /**
     * Default constructor.Initialize of constructor with empty variables.
     */
    public Account(){
        this(" "," ",0.0);
    }
    
    //parameterised constructor
    /**
     * Parameterised constructor
     * Initializes the object with these user input provided via arguments
     * @param accountHolder
     * @param accountNumber
     * @param accountBalance 
     */
    public Account(String accountHolder,String accountNumber,double accountBalance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
    }
    
    //accessor and mutators
    /**
     * Accessor method. Returns the contents in the account holder instance variable.
     * Returns a String variable
     * @return accountHolder
     */
    public String getAccountHolder(){
        return accountHolder;
    }
    
    /**
     * Mutator method. Sets/Overwrites/Initializes the contents of accountHolder
     * requires argument account Holder name from user
     * @param accountHolder 
     */
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    
    /**
     * Accessor method. Returns the account number instance variable content
     * Returns a String variable
     * @return accountNumber
     */
    public String getAccountNumber(){
        return accountNumber;
    }
    
    /**
     * Mutator method. Sets/Overwrites/Initializes the contents of the account number instance variable
     * Requires Argument account number from user
     * @param accountNumber 
     */
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    
    /**
     * Accessor method. Returns the balance instance variable
     * @return accountBalance
     */
    public double getAccountBalance(){
        return accountBalance;
    }
    
    /**
     * Mutator method. Sets/Initializes/Overwrites the contents of the account 
     * balance instance variable
     * requires initial bank balance
     * @param accountBalance 
     */
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    
    //methods
    /**
     * Return type method. Returns account balance after a deposit.
     * Method requires a double type deposit amount
     * @param depositAmount
     * @return 
     */
    public double makeDeposit(double depositAmount){
        
        accountBalance+=depositAmount;
        
        return accountBalance;
    }
    
    /**
     * A return type method. Returning the account Balance after a withdrawal.
     * Method requires Argument double type withdrawal Amount
     * @param withdrawalAmount
     * @return accountBalance
     */
    public double makeWithdrawal(double withdrawalAmount){
        
        accountBalance-= withdrawalAmount;
        
        return accountBalance;
    }
}
