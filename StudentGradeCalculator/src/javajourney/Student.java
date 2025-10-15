
package javajourney;

/**
 *
 * @author KGOTSO
 */
public class Student {
    //instances
    private String name;
    private double mark1;
    private double mark2;
    private double mark3;
    
    
    /**
     * default constructor
     */
    public Student(){
        this("",0,0,0);
    }
    /**parameterized constructor
     * 
     * @param name
     * @param mark1
     * @param mark2
     * @param mark3 
     */
    public Student(String name,double mark1,double mark2,double mark3){
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    
    //getters and setters
    public void setName(String name){
        this.name=name;
    }
    public void setMark1(double mark1){
        this.mark1=mark1;
    }
        public void setMark2(double mark2){
        this.mark2=mark2;
    }
            public void setMark(double mark3){
        this.mark3=mark3;
    }
    public String getName(){
        return name;
    }
    public double getMark1(){
        return mark1;
    }
     public double getMark2(){
        return mark2;
    }
    public double getMark3(){
        return mark3;
    }
    //method 
    public double calcAverage(double mark1,double mark2,double mark3){
        double average=(mark1+mark2+mark3)/3;
        return average;
    }
    
    //tostring
    public String toString(){
        return "Name: "+name+", Marks: "+ mark1 + ","+mark2+","+mark3;
    }
}
