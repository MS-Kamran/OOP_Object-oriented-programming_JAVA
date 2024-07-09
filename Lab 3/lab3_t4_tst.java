import java.util.Scanner;

public class lab3_t4_tst{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[5];
        int i, n;
        
        System.out.println("Enter total eight numbers between 2 and 4 only(otherwise I will have to make my array larger):");
        for(i=0 ; i<8 ; i++){
            n = scan.nextInt();
            arr[n] = arr[n]+1;
        }
        
        for(i=2 ; i<=4 ; ++i){
            System.out.println(i+" was found "+ arr[i]+ " times");        
        }
    }
}    
