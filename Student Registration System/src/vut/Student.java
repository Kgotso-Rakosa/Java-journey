
package vut;

/**
 *
 * @author KGOTSO
 */
public class Student {
    //private instance
    private String studentId;
    private String studentName;
    private String course;
    
    //default constructor
    /**
     * Default constructor that initializes the class instance variables with "none"
     */
    public Student(){
        this("none","none","none");
    }
    
    //parameterised
    /**
     * Parameterised constructor the initializes the class instance variables using the users input passed via arguments
     * @param studentId
     * @param studentName
     * @param course 
     */
    public Student(String studentId,String studentName,String course){
        this.studentName=studentName;
        this.studentId=studentId;
        this.course=course;
    }
    
    //accessor and mutator
    /**
     * Accessor method responsible for returning the student name
     * @return studentName
     */
    public String getStudentName(){
        return studentName;
    }
    
    /**
     * Mutator method that is responsible for initializing/overwrites the student name instance variable
     * @param studentName 
     */
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    
    /**
     * Accessor method responsible for returning the student id content
     * @return 
     */
    public String getStudentId(){
        return studentId;
    }
    
    /**
     * Mutator method responsible for initializing/ overwriting the content of the student id instance variable
     * @param studentId 
     */
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
    
    /**
     * Accessor method responsible for returning the contents of the course instance variable
     * @return 
     */
    public String getCourse(){
        return course;
    }
    
    /**
     * Mutator method responsible for initializing/overwriting the contents of the course instance variables
     * @param course 
     */
    public void setCourse(String course){
        this.course=course;
    }
    
    @Override
    public String toString(){
        return "Name: "+getStudentName()+",\nID: "+ getStudentId()+",\nCourse: "+getCourse()+"\n";
    }
        
}
