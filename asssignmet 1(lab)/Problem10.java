//PROBLEM 10) Triangle - Isoscele Draw number triangle of given height//

import java.util.Scanner;

public class Problem10{
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
            for (int i=1; i<=r*2-1 ; i++)
            {
                System.out.print(i);
            }
        System.out.println();
        }
    }        
}