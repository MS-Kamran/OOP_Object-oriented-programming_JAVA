import java.util.Scanner;

public class lab3_t6{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String s = scan.nextLine();
        
        
        
        System.out.println(s);
        System.out.println(s.concat("==THE END== "));
        System.out.println(s);
    }    
}