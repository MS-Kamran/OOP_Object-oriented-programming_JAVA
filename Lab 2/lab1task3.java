/*3:Write a Java program that would input ten numbers from the user and print the ten numbers sorted in descending 
 order.*/

import java.util.Scanner;

public class lab1task3 {
    public static void main (String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int a[] = new int [5];
        int j,i,temp;
        
        for (i=0 ; i<a.length ; i++)
        {
            System.out.println("Enter a values for array:");
            a[i] = scan.nextInt();
        }
        
        for (i=0 ; i<a.length ; i++)
        {
            for (j=1 ; j<a.length ; j++)
            {                
                if (a[j-1]<a[j])
                {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for(i =0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}