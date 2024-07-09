public class Car{
    public static int c=0;
    public int year;
    Car(int year){
        this.year = year;
        c++;
    }
    public int getYear(){
        return year;
    }
    public static int getObjectCount(){
        return c;
    }
}