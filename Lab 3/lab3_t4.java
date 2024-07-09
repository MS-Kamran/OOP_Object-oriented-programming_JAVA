import java.util.Scanner;

public class lab3_t4{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word:");
        String s = scan.nextLine();
        
        char [] wr = s.toCharArray ();
        int[] arr = new int[91];
        char ch = 'a';
        
        for (int j=0 ; j<wr.length ; j++){
            ch = s.charAt(j);            
            int a = (int) ch;
            arr[a] = arr[a]+1;
        }
        
        for (int i=65 ; i<arr.length ; i++){
            System.out.println((char)i+" which is "+(int)i+" was found "+arr[i]+ " times");
        }
    }
}
