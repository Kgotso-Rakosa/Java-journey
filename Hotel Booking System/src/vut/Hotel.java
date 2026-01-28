
package vut;

/**
 *
 * @author KGOTSO
 */
public class Hotel {
    //instance variables
    private int roomNumber;
    private String roomType;
    private double roomPrice;
    private boolean isBooked;
    
    //default constructor
    public Hotel(){
        this("none",0,0.0,false);
    }
    
    //parameterised constructor
    public Hotel(String roomType,int roomNumber,double roomPrice,boolean isBooked){
        this.roomType=roomType;
        this.roomNumber=roomNumber;
        this.roomPrice=roomPrice;
        this.isBooked=isBooked;
    }
    
    //accessors and mutators
    public String getRoomType(){
        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType=roomType;
    }
    
    public int getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber=roomNumber;
    }
    
    public double getRoomPrice(){
        return roomPrice;
    }
    public void setRoomPrice(double roomPrice){
        this.roomPrice=roomPrice;
    }
    
    public boolean getIsBooked(){
        return isBooked;
    }
    public void setIsBooked(boolean isBooked){
        this.isBooked=isBooked;
    }
    
    //tostring 
    @Override
    public String toString(){
       return "Room number: "+getRoomNumber()+ " \nRoom Price: "+ getRoomPrice()+" \nRoom Type: "+ getRoomType()+"\n"; 
    }
}
