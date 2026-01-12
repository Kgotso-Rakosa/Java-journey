
package vut;

/**
 *
 * @author KGOTSO
 */
public class Cart {
    //instance variables
    private String productName;
    private double productPrice;
    
    //default constructor
    /**
     * Default constructor. Sets instance variables to empty entities.
     */
    public Cart(){
        this(" ",0.0);
    }
    //parameterised constructor
    /**
     * Parameterised constructor. Sets the instance variables of this Cart class
     * with user input.
     * Requires two arguments String product name and double product price
     * @param productName
     * @param price 
     */
    public Cart(String productName,double productPrice){
        this.productName=productName;
        this.productPrice=productPrice;
    }
    
    //accesor and mutator
    /**
     * Accessor method.Returns the product name
     * @return productName
     */
    public String getProductName(){
        return productName;
    }
    
    /**
     * Mutator method. Modifies the contents of the product name instance variable
     * by pass the users input via the method argument.
     * @param productName 
     */
    public void setProductName(String productName){
        this.productName=productName;
    }
    
    /**
     * Accessor method.Returns the product price
     * @return productPrice
     */
    public double getProductPrice(){
        return productPrice;
    }
    
    /**
     * Mutator method. Modifies the instance variable productPrice
     * by passing user input via the argument
     * @param productPrice 
     */
    public void setProductPrice(double productPrice){
        this.productPrice=productPrice;
    }
    
    public void setProductNameAndPrice(String productName,double productPrice){
        this.productName=productName;
        this.productPrice=productPrice;
    }
}
