/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vut;

/**
 *
 * @author KGOTSO
 */
public class Login {
    
    //instance variables
    private String userName;
    private String passWord;
    
    //default constructor
    /**
     * Default constructor that initializes the class instance variables with nulls
     */
    public Login(){
        this("none",null);
    }
    //parameterised
    /**
     * Parameterised constructor that initializes the instance variables of the class with user input 
     * passed via the Argument.
     * @param userName
     * @param passWord 
     */
    public Login(String userName,String passWord){
        this.userName=userName;
        this.passWord=passWord;
    }
    
    //accessor and mutator
    /**
     * Accessor method.Returns the username variable
     * @return userName
     */
    public String getUserName(){
        return userName;
    }
    
    /**
     * Mutator method.Sets/initializes/modifies the username instance variable with a users input pass via the argument
     * @param userName 
     */
    public void setUserName(String userName){
        this.userName=userName;
    }
    
    /**
     * Accessor method.Returns the password instance variable
     * @return passWord
     */
    public String getPassWord(){
        return passWord;
    }
    
    /**
     * Mutator method.Sets/Initializes/Modifies the instance variable password via the input argument
     * @param passWord 
     */
    public void setPassWord(String passWord){
        this.passWord=passWord;
    }
    
    //validation method
    public boolean validateInput(String userName,String passWord){
        return this.userName.equalsIgnoreCase(userName) && this.passWord.equalsIgnoreCase(passWord);
    }
}
