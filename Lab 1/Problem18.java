//PROBLEM 18) Hollow Triangle  Draw right angled triangle of given height//

import java.util.Scanner;

public class Problem18{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        for (int r=1; r<=n; r++)
        {
            for (int s=1; s<=n-r; s++)
            {
            System.out.print(" ");
            }
            for (int c=1; c<=r ; c++)
            {
             if(r==1 || r==n || c==1 || c==r)
             {
                 System.out.print("*");
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