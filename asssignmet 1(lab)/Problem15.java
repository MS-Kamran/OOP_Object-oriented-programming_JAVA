//PROBLEM 15) Hollow Rectangl Display a number rectangle of given length and width.//

import java.util.Scanner;

public class Problem15{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        for (int r=1; r<=n; r++)
        {        
         for (int c=1; c<=n ; c++)
         {
             if(r==1 || r==n || c==1 || c==n)
             {
                 System.out.print(c);
             }
             else 
             {
                 System.out.print(" ");
             }
         }
        System.out.println();
        }
    }        
}