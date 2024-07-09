//PROBLEM 24) Palindrome//

import java.util.Scanner;

public class Problem24{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();        
        int i,c=0;
        
        for (i=1; i<n ; i++)
        {
            System.out.print(i);
            c++;
        }
        if (c+1==n)
        {
           for (i=n; i<=n ; i--)               
               {
                System.out.print(i);
                if (i==1)
                    break;
               } 
        }
        System.out.println();
    }        
}