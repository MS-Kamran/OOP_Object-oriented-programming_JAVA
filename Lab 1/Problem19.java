//PROBLEM 19) Hollow Triangle - Right Justified Draw right angled number triangle of given height//

import java.util.Scanner;

public class Problem19{
    public static void main(String [] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        
        int a=0;
        
        for (int r=1 ; r<=n ; r++)
        {
            a=0;
            for (int s=1 ; s<=n-r ; s++)
            {
            System.out.print(" ");
            a++;
            }
            for (int c=1 ; c<=r ; c++)
            {     
            if(r==1 || r==n || c==1 || c==r)
             {
                 System.out.print(a+c);
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