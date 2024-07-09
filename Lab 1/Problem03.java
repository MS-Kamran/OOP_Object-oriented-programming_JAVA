//PROBLEM 3) Rectangle//

import java.util.Scanner;

public class Problem03{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        for (int x=1; x<=n; x++)
        {        
         for (int i=1; i<=n ; i++)
         {
             System.out.print("*");
         }
        System.out.println();
        }
    }        
}