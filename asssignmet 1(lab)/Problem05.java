//PROBLEM 5) Triangle - Left Justified Draw right angled triangle of given height//

import java.util.Scanner;

public class Problem05{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        for (int r=1; r<=n; r++)
        {        
         for (int i=1; i<=r ; i++)
         {
             System.out.print("*");
         }
        System.out.println();
        }
    }        
}