public class ComplexNumber extends RealNumber{
    
    public double a = 1;
    public double b = 1;
    
    ComplexNumber(){
    }
    ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }
    public String toString() {
        String s = "RealPart: " + a;
        s = s + "\nImaginaryPart:";
        s = s + b;   
        return s;
    }
    public void check(){
        System.out.println("I'm in ComplexNumber class");
        ping();
        System.out.println("Checking ended.");
    }
}