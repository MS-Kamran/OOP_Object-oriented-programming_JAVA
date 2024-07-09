/*7. Modify your solution for the question number 4. Take 11 numbers such that any numbers can exist at maximum 
four times. That means any number can be entered multiple times but when the use enters same numbers for 5 th 
time, it should reject and ask for any other number but that number.
e.g. Imagine the user entered 3,2,5,7,2,3,2,0,9,2,3. If the user tries to enter 2 again, it must not
allow it because 2 is already there, 4 times.*/

import java.util.Scanner;

public class lab1task7 {
    public static void main (String args[] ){
        
        int[] n = new int[5];
        Scanner scan = new Scanner (System.in);
        
        for (int i=0 ; i<n.length ; i++)
        {
            System.out.println("ENTER A VALUE FOR STORE:");
            n[i] = scan.nextInt();
            
            int c=0;
            
            for (int j=0 ; j<=i ; j++)
            {       
                if(n[i]==n[j])
                {
                    c++;
                }
                if (c==5)
                {
                    System.out.println("Enter a Different number:");
                    n[i] = scan.nextInt();
                }
            }
        }
        
        System.out.println("The Inputes are:");
        for (int i=0 ; i<n.length ; i++)
        {
            System.out.print(n[i]+", ");
        }
        System.out.println();
    }
}