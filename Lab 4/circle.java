public class circle{
    private double radius = 1;
    private String color = "Red";
    
    circle(){
    }
    
    circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    } 
    public void setRadius(){
        this.radius = radius;
    } 
    
    public String getColor(){
        return color;
    } 
    public void setColor(){
        this.color = color;
    } 
    
    public double getArea(){
        double area = 3.1416*radius*radius;
        return area;
    }
}