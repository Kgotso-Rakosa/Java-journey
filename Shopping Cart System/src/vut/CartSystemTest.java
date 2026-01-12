
package vut;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author KGOTSO
 */
public class CartSystemTest {


    public static void main(String[] args) {
        //variables 
        String pattern=" EEEE/MMMM/yyyy HH:mm aa";
        String serviceNumber="";
        String productName="";
        double productPrice=0.0;
        int removeProductIndex=0;
        
        //constants 
        final String ONE="1",TWO="2",THREE="3",FOUR="4",FIVE="5";
        
        //java classes
        GregorianCalendar date=new GregorianCalendar();
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        Scanner input=new Scanner(System.in);
        
        //display the date 
        System.out.println("Date: "+ format.format(date.getTime()));
        
        
        ArrayList<Cart> cartList=new ArrayList<>();
        
        System.out.println("Menu");
        System.out.println("1.Add product.");
        System.out.println("2.Remove product.");
        System.out.println("3.View Cart.");
        System.out.println("4.Checkout.");
        System.out.println("5.Exit.");
        
        do{
            System.out.print("Enter desired service (1-4): ");
            serviceNumber=input.nextLine();
            
            if(serviceNumber.equalsIgnoreCase(ONE)){
                
                System.out.print("Enter Product Name:");
                productName=input.nextLine();
                
                System.out.print("Enter "+ productName + " price, R ");
                productPrice=input.nextDouble();
                
                input.nextLine();//clear scanner
                
                //create cart obj
                Cart objCart=new Cart(productName, productPrice);
                
                //add the cart obj to arraylist
                //e.g. cartList[0]------->objCart("Apple",6)
                cartList.add(objCart);
                
            }else if(serviceNumber.equalsIgnoreCase(TWO)){
                
                System.out.print("Which product would you like to remove? e.g Product: 3 \n Enter Product: ");
                removeProductIndex=input.nextInt();
                
                if(removeProductIndex>0 && removeProductIndex <= cartList.size()){
                    //call remove method and subtract 1 because array indexing start from 0
                    cartList.remove(removeProductIndex-1);
                    
                    System.out.println("Removal complete.");
                    
                    input.nextLine();
                    
                }else if (cartList.isEmpty()){
                    
                    System.out.println("No Products in cart");
                    
                    input.nextLine();
                    
                }else{
                    
                    System.out.println("Input must be in between 0 - "+ cartList.size()+" .");
                    
                    input.nextLine();
                    
                }
                
            }else if(serviceNumber.equalsIgnoreCase(THREE)){
                // this is not user friendly
                System.out.println(cartList);//output is [vut.Cart@7106e68e, vut.Cart@7eda2dbb]
                
                //therefore there are two ways to accessing the methods of objCart(object) via the cartList(array list)
                //for both solutions you must use a loop and get the accessor methods
                
                if(cartList.isEmpty()){
                    
                    System.out.println("Your cart is empty.");
                    
                }else{
                    System.out.println("Cart: ");
                    
                    for(int i=0;i<cartList.size();i++){
                        //create an obj of the cart class, but assign .get() of the cartList(arrayList)
                        Cart objCart2=cartList.get(i);//Create a reference variable called objCart2 that points to the Cart object that is already inside the ArrayList. 
                        
                        System.out.println((i+1)+". "+ objCart2.getProductName()+" is R "+ objCart2.getProductPrice());
                    }
                }
            }else if(serviceNumber.equalsIgnoreCase(FOUR)){
                
                double total=0.0;
                
                //you can use this way. using a for loop
               // if(cartList.isEmpty()){
                //    System.out.println("Total = " + total);
               // }else{
                //    for(int i=0;i<cartList.size();i++){
                //         Cart objCart=cartList.get(i);
                    
                //         total+=objCart.getProductPrice();
                //         System.out.println("Total R "+total);
              //      }
               // }
                
                //or you can use this way . using a for each loop
                for(Cart objCart:cartList){//look for Chart type objects in cartList (arraylist) and allow objChart to have their references
                    total+=objCart.getProductPrice();
                    
                }
                  System.out.println("Total = R"+ total);
                
            }else if(serviceNumber.equalsIgnoreCase(FIVE)){
                System.out.println("GOODBYE!");
            }else {
                System.out.println("wrong input, enter options 1 - 4.");
            }
        }while(!serviceNumber.equalsIgnoreCase(FIVE));
    }
    
}
