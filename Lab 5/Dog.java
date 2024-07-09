public class Dog { 
    
    private String color = "Black"; 
    
    Dog(){
    } 
    Dog(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void changeColor(String color){
        this.color=color;
    }

    public void bark(){
        System.out.println(this.color+" dog is barking");
    }       
} 