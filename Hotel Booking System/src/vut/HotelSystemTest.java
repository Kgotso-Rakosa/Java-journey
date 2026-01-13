
package vut;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author KGOTSO
 */
public class HotelSystemTest {

    public static void main(String[] args) {
    //variables
    String pattern=" EEEE(dd)/MMMM/yyyy HH:mm aa";
    String userInput="";
    String roomType="";
    int roomNumber=0;
    double roomPrice=0.0;
    
    //constants
    final String ONE="1",TWO="2",THREE="3",FOUR="4",FIVE="5",SIX="6";
    
    //java classes
    Scanner input=new Scanner(System.in);
    SimpleDateFormat format=new SimpleDateFormat(pattern);
    GregorianCalendar date=new GregorianCalendar();
    ArrayList<Hotel> hotelList= new ArrayList<>();
    
    //Display date
    System.out.println("Date: "+ format.format(date.getTime())+"\n");
    
    //Ask question
    System.out.println("Pick one of the following from the menu.Enter the number only. e.g Option: 1 \n");
    System.out.println("        Menu.");
    System.out.println("1.Add a Room. \n2.View all Rooms. \n3.Book a room. \n4.View Booked rooms. \n5.Checkout \n6.Exit. \n");
    
    //get input
    do{
        
        //get user option
        System.out.print("What task would you like to do? \nOPTION:");
        userInput=input.nextLine();
        System.out.println("\n");
        
        if (userInput.equalsIgnoreCase(ONE)){
         
            //add room
            System.out.print("Room number: ");
            roomNumber=input.nextInt();
            input.nextLine();//clear scanner
            
            System.out.print("\nRoom Type:");
            roomType=input.nextLine();
            
            
            System.out.print("\nRoom Price: R ");
            roomPrice=input.nextDouble();
            input.nextLine();
            System.out.println("\n");
            
            //hotel object
            Hotel objHotel=new Hotel();
            //assign class instance variable via setters
            objHotel.setRoomNumber(roomNumber);
            objHotel.setRoomPrice(roomPrice);
            objHotel.setRoomType(roomType);
            
            //pass objHotel to HotelList
            hotelList.add(objHotel);
        
        }else if(userInput.equalsIgnoreCase(TWO)){
            
            //view all hotels
            if(hotelList.isEmpty()){
                System.out.println("There are no rooms added.\n");
            }else{
                //get reference of existing objHotel in hotelList
                for(int i=0;i<hotelList.size();i++){
                
                    Hotel hotelRef=hotelList.get(i);//creates a hotel object that has the memory location/reference from the hotelList
                    
                    System.out.println("Room ");
                    System.out.println(hotelRef.toString());
                    
                }
            }
                        
        }else if(userInput.equalsIgnoreCase(THREE)){
            
            //book a room
            if(hotelList.isEmpty()){
                
                System.out.println("There are no rooms to book.\n");
                
            }else{
                
                boolean booked=false;
                
                System.out.print("Enter the room number you would like to book:");
                int requiredRoomNumber=input.nextInt();
                input.nextLine();
                
                for(Hotel hotelRef:hotelList){
                    if(requiredRoomNumber == hotelRef.getRoomNumber()){
                        hotelRef.setIsBooked(true);
                    }
                    
                if(requiredRoomNumber== hotelRef.getRoomNumber()){    
                    System.out.println("Room "+ hotelRef.getRoomNumber()+" has been successfully booked.\n");
                    booked=true;
                }
                
                }
                
                if(!booked){
                    System.out.println("Room does not exist\n"); 
                }
                
                
            }
            
        }else if(userInput.equalsIgnoreCase(FOUR)){
            
            if(hotelList.isEmpty()){
                System.out.println("There are no rooms to book.");
            }else{
                boolean found=false;
                for(Hotel hotelRef:hotelList){
                    
                    if(hotelRef.getIsBooked()==true){
                        System.out.println(hotelRef.toString());
                        found=true;
                    }
                    
                }
                
                if(!found){
                    System.out.println("No rooms have been booked.");
                }
                
            }
            
        }else if(userInput.equalsIgnoreCase(FIVE)){
            double total=0.0;
            boolean found=false;
            
            for(Hotel hotelRef:hotelList){
                
                if(hotelRef.getIsBooked()==true){
                    total+=hotelRef.getRoomPrice();
                }
                found=true;
            }
            
            if(!found){
                System.out.println("There are no booked rooms");
            }
            
            System.out.printf("Total: R %10.2f\n",total);
            
            
        }else if(userInput.equalsIgnoreCase(SIX)){
            
            System.out.println("Thank you for using my program.\n");
            
        }else{
            
            System.out.println("Invalid input.Pick between: \n1.Add room. \n2.View... \n3.Booking... \n4.View Booked rooms. \n5.Checkout. \n6.Exit\n");
            
        }
        
        
    }while(!userInput.equalsIgnoreCase(SIX));
    
    }
    
}
