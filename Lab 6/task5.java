import java.util.Scanner;

public class task5{
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String s = scan.nextLine();
        
        char [] wr = s.toCharArray ();
        int[] arr = new int[91]; 
        char ch = 'a';
        
        for (int j=0 ; j< wr.length ; j++){
            ch = s.charAt(j);            
            int a = (int) ch;
            arr[a] = arr[a]+1;
        }
        
        int max = 0, max2 = 0;
        int ind=0;
        for (int j=0 ; j< arr.length ; j++){
            if (arr[j] > max){
                max2 = max;
                ind = j;
                max = arr[j];
            }
            else if(arr[j] > max2){
                max2 = arr[j];
                ind = j;
            }
        }
        System.out.println((char)ind);
    }
}