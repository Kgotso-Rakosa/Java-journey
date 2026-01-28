
package vut;

import java.util.Arrays;

/**
 * This class will receive marks and its job is to grade those marks
 * 75+ Distinction
 * 60-74 Merit
 * 50-59 Pass
 * <50 Fail
 * @author KGOTSO
 */

public class Student {
    
    //instance variables 
    private String studentId;
    private String studentName;
    private String[] moduleNames;
    private double[] marks;
    
    //constant
    public static final int FIVE=5;
    
    //default constructor
    /**
     * Default constructor to set instance variables to nulls.
     */
    public Student(){
        
        this("No ID","No Name",null,null);
        
    }
    
    //parameterised constructor
    /**
     * Parameterised constructor to initialize instance variables using user input
     * @param studentId
     * @param studentName
     * @param moduleNames
     * @param marks 
     */
    public Student(String studentId,String studentName,String[]moduleNames,double[] marks){
        
        this.studentId=studentId;
        this.studentName=studentName;
        this.moduleNames=moduleNames;
        this.marks=marks;
        
    }
            
    //setters and getters
    
    /**
     * Accessor method. Returns the Students ID
     * @return studentID
     */
    public String getStudentId(){
        
        return studentId;
        
    }
    
    /**
     * Mutator method.Initializes/Overrides the contents of the Student ID 
     * @param studentId 
     */
    public void setStudentId(String studentId){
        
        this.studentId=studentId;
        
    }
    
    /**
     * Accessor method. Returns the Students Name
     * @return studentName
     */
    public String getStudentName(){
        
        return studentName;
        
    }
    
    /**
     * Mutator method.Initializes/Overrirdes the contents of the Student Name.
     * @param studentName 
     */
    public void setStudentNmae(String studentName){
        
        this.studentName=studentName;
        
    }
    
    /**
     * Accessor method.Returns the Module Name
     * @return moduleName
     */
    public String[] getModuleNames(){
        
        return moduleNames;
        
    }
    
    /**
     * Mutator method.Initializes/Overrides the contents of the Module Name
     * @param moduleNames 
     */
    public void setModuleName(String[] moduleNames){
        
        this.moduleNames=moduleNames;
        
    }
    
    /**
     * Accessor method.Returns the Marks of the student
     * @return marks
     */
    public double[] getMarks(){
        
        return marks;
        
    }
    
    /**
     * Mutator method.Initializes/Overrides the contents of the marks variable
     * @param marks 
     */
    public void setMarks(double[] marks){
        
        this.marks=marks;
        
    }
    
    //grade marks 
    /**
     * Grade marks will receive an array of marks,go through it, and assign the correct
     * grade to each element mark in the array. After grading the marks those grades will be stored in
     * an array results that will be returned by the method.
     * @param marks
     * @return results
     */
    public String[] gradeMarks(){
        
        String[] results=new String[FIVE];
        
        for(int i=0;i<FIVE;i++){
            
            //get content of each element and store them in variables
            double mark=marks[i];
            
            //create condition for marks (Distinction,Merit,Pass,Fail
            if(mark>74){
                
                results[i]="Distinction";
                
            }else if(mark>59){
                
                results[i]="Merit";
                
            }else if(mark>49){
                
                results[i]="PASS";
                
            }else{
                
                results[i]="FAIL!!!!";
                
            }
              
        }
        
        return results;
        
    }
    
    //average method 
    public double getAverage(){
        
        double average=0.0;
        double sum=0.0;
        
        for(int i =0;i<FIVE;i++){
            
            sum=sum+marks[i];
            
        }
        
        return average=sum/FIVE;
    }
    
    //display 
    public void display(){
        
        
        
        for(int i=0;i<FIVE;i++){
            
            System.out.println((i+1)+ ". "+ moduleNames[i]+": "+ marks[i]+ "\nResults: "+ Arrays.toString(gradeMarks())+" \nAverage: "+ getAverage());
            
        }
        
    }
}
