public class Jackfruit extends Fruit{
    
    Jackfruit(){
        super(false ,"jackfruit");
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