/*3. Write a java program that will print all unique elements in an array. If input array is {2, 6, 8, 2, 4, -5, 
 10, 8, 4, 6, 1, 0, 1, 10, 7}. The output will be: -5, 0, 7*/

import java.util.Scanner;

public class lassig2_task3 {
    public static void main (String args[] ){
        
        int[] n = new int[10];
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter values for store:");
        for (int i=0 ; i<n.length ; i++)
        {
            n[i] = scan.nextInt();
        }
        
        for (int i=0 ; i<n.length ; i++)
        {
            int c=0;
            for (int j=0 ; j<n.length ; j++)
            {
                if(i!=j)
                {
                    if (n[i]==n[j])
                    {
                        c++;
                    }
                }
            }
           if (c==0)
           {
               System.out.println(n[i]);
           }
        }
    }
}