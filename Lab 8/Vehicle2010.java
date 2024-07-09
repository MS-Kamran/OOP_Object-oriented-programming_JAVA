public class Vehicle2010 extends Vehicle {

    public void UpperRight(){
        y++;
        x++;
    }
    public void UpperLeft(){
        y++;
        x--;
    } 
    public void LowerRight(){
        y--;
        x++;
    }
    public void moveLowerLeft(){
        y--;
        x--;
    } 
    public boolean equals(Vehicle2010 car) {
        return (this.x == car.x && this.y == car.y);
    }
}