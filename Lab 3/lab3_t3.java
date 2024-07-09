import java.util.Scanner;

public class lab3_t3{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String s = scan.nextLine();
        
        for (int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            int codeForCh = (int) ch;
            System.out.println(s.charAt(i)+" : "+codeForCh); 
        }
        System.out.println(); 
        
        for (int i=0 ; i<s.length() ; i++){
            int codeForCh = s.codePointAt(i);
            System.out.println(s.charAt(i)+" : "+codeForCh);
 
        }
    }    
}