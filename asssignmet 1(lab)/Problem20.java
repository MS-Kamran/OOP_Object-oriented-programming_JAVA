//PROBLEM 20) Hollow Triangle Draw triangle of given height//

import java.util.Scanner;

public class Problem20{
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
            for (int c=1; c<=r*2-1 ; c++)
            {
                if(r==1 || r==n || c==1 || c==r*2-1)
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