import java.util.Scanner;

public class lab3_t2{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String s = scan.nextLine();
        
        for (int i=0 ; i<s.length() ; i++){
            System.out.println(s.charAt(i));
        }
    }    
}