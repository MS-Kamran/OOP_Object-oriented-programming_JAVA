import java.util.Scanner;

public class lab3_t5{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        String c = "==THE END==";
        
        System.out.println("Enter a word:");
        String s = scan.nextLine();
        
        System.out.println(s);
        System.out.println(s+c);
        System.out.println(s);
    }    
}