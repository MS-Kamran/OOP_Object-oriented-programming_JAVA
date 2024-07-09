public class Student{
    
    public String name = "Ei name e kono student nai";
    public String address = "Naam nai .. thikana ashbe koi theke?";
    public String id = "Student ei nai, abar id :P";
    private double cgpa = -4.0;
    
    Student(){
    }
    Student(String name, String id, String address, double cgpa){
        this.name = name;
        this.id = id;
        this.address = address;
        this.cgpa = cgpa;
    }
    
    public String nameDao(){
        return name;
    }
    public String boloToAmiKe(){
        return id;
    }
    public String addressDao(){
        return address;
    }
    public double cgpaDao(){
        return cgpa;
    }
        
    public void nameBoshao(String name){
        this.name = name;
    } 
    public void addressBoshao(String address){
        this.address = address;
    }
    public void idBoshao(String id){
        this.id = id;
    }
    public void cgpaBoshao(double cgpa){
        this.cgpa = cgpa;
    }
                        
    public void standUp(){
        System.out.println(this.name+"is now standing up!!");
    }
    public String tellMeYourName(){
        String s = "Sir, my name is "+this.name;
        return s;
    }
    public void call(String nam){
        System.out.println(this.name+": Hey, "+nam+", Sir is calling you!!");
    }
    public int add2Numbers(int x, int y){
        int sum = x + y;
        return sum;
    }                    
}