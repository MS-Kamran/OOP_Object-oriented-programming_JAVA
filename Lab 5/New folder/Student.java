public class Student{
    
    private String name = "default name";
    public static int numberOfStudents=0;
    
    Student(){
        numberOfStudents++;
    }
    Student(String name){
        this.name = name;
        numberOfStudents++;
    }
    
    public String getName(){
        return name;
    }
    
    public static int numberOfStudents(){
        return numberOfStudents;
    }
    
}