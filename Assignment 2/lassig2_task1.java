/*1. Write a java program that will take input k integers into an array & only reverse the numbers at even places 
of the array. For example, if the user gave input k=8 numbers, such as {3, 10, 4, 2, 5, 18, -3}. The output will 
be {-3,10,5,2,4,18,3}.*/

import java.util.Scanner;

public class lassig2_task1 {
    public static void main (String args[] ){
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a array size:");
        int n = scan.nextInt();
        
        int[] k = new int[n];
        
        System.out.println("Enter values for store:");
        for (int i=0 ; i<k.length ; i++)
        {
            k[i] = scan.nextInt();
        }
        for(int i=0 ; i<k.length/2 ; i++)
        {       
            if (i%2==0)
            {              
                int temp=k[i];
                k[i]=k[n-1-i];
                k[n-1-i]=temp; 
            }            
        }        
        for(int j=0 ; j<k.length ; j++)
        {
            System.out.print(k[j]);
        }
        System.out.println();
    }
}