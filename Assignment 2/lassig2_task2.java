/*2. Write a java program that will concatenate two arrays into a single array. For example, if input arrays are 
A:{3, 10, 5} & B:{-45, 91, 67, 43, 100}, the output array will be: {3, 10, 5,-45, 91, 67, 43, 100}.*/

import java.util.Scanner;

public class lassig2_task2 {
    public static void main (String args[] ){
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 'A' array size: ");
        int n = scan.nextInt();
        System.out.println("Enter 'B' array size: ");
        int n1 = scan.nextInt();
        
        int[] b = new int[n1];
        int[] a = new int[n];
        int[] c = new int[n+n1];
        int d=0; 
        
        System.out.println("Enter values for store 'A' array:");
        for (int i=0 ; i<a.length ; i++)
        {
            a[i] = scan.nextInt();
            c[i]=a[i];
            d++;
        }
        System.out.println("Enter values for store 'B' array:");
        for (int i=0 ; i<b.length ; i++)
        {
            b[i] = scan.nextInt();
            c[d]=b[i];
            d++;
        }
        
        for (int i=0 ; i<c.length ; i++)
        {
            System.out.print(c[i]);
        }
        System.out.println();
        
    }
}