public class Vehicle{
    public int x=0;
    public int y=0;
    
    Vehicle(){
    }
    
    Vehicle(int x , int y){
        this.x = x;
        this.y = y;
    }
    
    public void moveUp(){
        y++;
    }
    
    public void moveLeft(){
        x--;
    }
        
    public void moveDown(){
        y--;
    }
    
    public void moveRight(){
        x++;
    }
    
    public String toString(){
        this.x = x;
        this.y = y;
        
        String s = "(";
        s = s + x;
        s = s + " ";
        s = s + y;
        s = s + ")";
        
        return s;
    }
}