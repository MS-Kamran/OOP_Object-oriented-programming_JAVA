public class Author{
    private String firstName;
    private String lastName;
    
    Author(){
    }
    
    public Author (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName; 
    }
    public void setLastName(String lastName){
        this.lastName=lastName; 
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public String toString(){
        String s="First Name: "+firstName;
        s=s+"\n Last Name: "+lastName;
        return s;
    }
}