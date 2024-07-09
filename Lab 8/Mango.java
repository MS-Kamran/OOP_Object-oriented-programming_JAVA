public class Mango extends Fruit{
    
    Mango(){
        super(true ,"mango");
    }
    public String toString(){
        String s;
        if(hasFormalin())
        {
            s = getName()+"s are bad for you";
        }
        else 
        {
            s = getName()+"s are good for you";
        }
        return s;
    }  
}