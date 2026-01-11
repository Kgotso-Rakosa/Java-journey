
package vut;

/**
 * this class will collect studentNames[] and studentMarks[]
 * @author KGOTSO
 */
public class Students {
    //instance variables
    private String studentName;
    private String[] moduleNames;
    private double[] studentMarks;
    
    //constants
    public static final int FIVE=5;
    //default constructor
    /**
     * This constructor will pass null for both Name and Marks arrays
     */
    public Students(){
        //default arguements
        this("",null,null);
    }
    //parameterised constructor
    /**
     * This constructor will require three array arguments. A String for student name and String array for
     * module names ,lastly a double array for student marks.
     * @param studentNmae 
     * @param moduleNames
     * @param studentMarks 
     */
    public Students (String studentNmae,String[] moduleNames,double[] studentMarks){
        this.studentName=studentNmae;
        this.moduleNames=moduleNames;
        this.studentMarks=studentMarks;
    }
    
    /**
     * Accessor method to return the student name 
     * @return the string variable for student names
     */
    public String getStudentName(){
        return studentName;
    }
    
    /**
     * Mutator method. Sets/initializes,or overwrites the contents of the student name variable
     * @param studentName 
     */
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    
    //accessors and mutators
    /**
     * Accessor method
     * @return the String type array with student Names.
     */
    public String[] getModuleNames(){
        return moduleNames;
    }
    
    /**
     * Mutator method. Sets,initialize,or overwrites the contents of student Name array variable
     * @param moduleNames 
     */
    public void setModuleNames(String[] moduleNames){
        this.moduleNames=moduleNames;
    }
    
    /**
     * Accessor method
     * @return the double type array variable for student Marks
     */
    public double[] getStudentMarks(){
        return studentMarks;
    }
    
    /**
     * Mutator method.Sets,initialize,or overwrites the contents of the array variable student Marks
     * @param studentMarks 
     */
    public void setStudentMarks(double[] studentMarks){
        this.studentMarks=studentMarks;
    }
    
    public void processMarks(String[] moduleNames,double[] studentMarks){
        
        String[] results=new String[FIVE];
        
        for(int i=0;i<FIVE;i++){
            
            String module="";
            double mark=0.0;
            
            module=moduleNames[i];
            mark=studentMarks[i];
            
            if(mark >= 50){
                results[i]="PASS";
            }else{
                results[i]="FAIL";
        }
        }
        
        //display results
        for(int i=0;i<FIVE;i++){
            System.out.println((i+1) +". "+ moduleNames[i]+": "+results[i]);
        }
    }
        
}
