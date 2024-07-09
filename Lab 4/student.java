public class student{
    private String name;
    private String id; 
    private String addres;
    private double cgpa;
    
    student(){
    }
    
    student(String name, String id, String addres, double cgpa){
        this.name = name;
        this.id = id;
        this.addres = addres;
        this.cgpa = cgpa;
    }
    
    public void setName(String n){
        this.name = name;
    }
    public void setID(String i){
        this.id = id;
    }
    public void setAddress(String a){
        this.addres = addres;
    }
    public void setCGPA(double c){
        this.cgpa = cgpa;
    }

    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }   
    public String getAddress(){
        return addres;
    }    
    public double getCGPA(){
        return cgpa;
    }
}
