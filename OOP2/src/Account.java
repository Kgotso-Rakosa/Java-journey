
/**
 * This will be a account program 
 * This class will have withdraw,deposit,balance
 * @author KGOTSO
 */
public class Account {
    //instance variables
    private String name;
    private int accountNumber;
    private double balance;
    
    //default constructor

    public Account(){
        this("none",0000000000,0);
    }
    //overloaded constructor
    public Account(String name,int accountNumber,double balance){
        this.name=name;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    
    //getters/accesses
    /**
     * This method will return a name
     * @return name
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method will return the Account Number
     * @return accountNumber
     */
    public int getAccountNumber(){
        return accountNumber;
    }
    
    /**
     * This method returns the users balance
     * @return balance
     */
    public double getBalance(){
        return balance;
    }
    
    //setters/mutators
    /**
     * This method will set the name variable
     * @param name 
     */
    public void setName(String name){
     this.name=name;
    }
    
    /**
     * This method will set the accountNumber variable
     * @param accountNumber 
     */
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    
    //methods
    /**
     * THis method is get a deposit amount to be added to the balance
     * @param depositAmount 
     */
    public void makeDeposit(double depositAmount){
        balance+=depositAmount;
    }
    
    /**
     * This method will remove the withdrawalAmount from the balance
     * @param withdrawalAmount 
     */
    public void makeWithdrawal(double withdrawalAmount){
        balance-=withdrawalAmount;
    }
    
    //tostring
    public String toString(){
        return "name:"+name+", accountNumber: "+accountNumber+ ", balance: "+ balance;
    }
}
