/*4. Write a Java program that would ask the user to enter five numbers. As the user enters the five
numbers the program will make sure that all the numbers entered by the user are unique. For
example if the user enters 2, 3, 4, 6, and then tries to enter 3 again the program will display that 3
is already in among the entered numbers and would ask the user to enter a new number. You will
have to keep taking numbers from the user until you receive five unique numbers. At the end, print
those five unique numbers.*/

import java.util.Scanner;

public class lab1task4 {
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
                if (c==2)
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