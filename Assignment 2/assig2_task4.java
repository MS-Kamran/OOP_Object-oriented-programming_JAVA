/*4. Write a java program that will take input two numbers a & b and will replace all a’s from an array with b. 
For example, if input array is {2, 8, 10, 3, -2, 56, 71, 2, 9}, and a=2, b=7,the output array will be {7, 8, 10, 
3, -2, 56, 71, 7, 9}.4. Write a java program that will take input two numbers a & b and will replace all a’s from
an array with b. For example, if input array is {2, 8, 10, 3, -2, 56, 71, 2, 9}, and a=2, b=7, the output array 
will be {7, 8, 10, 3, -2, 56, 71, 7, 9}.*/

import java.util.Scanner;

public class assig2_task4 {
  public static void main (String args[] ){
    
    int a,b;
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter valuse for store in array:");
    for (int i=0 ; i<n.length ; i++)
    {
      n[i] = scan.nextInt();
    }
    System.out.println();
    
    System.out.println("Enter a value for A:");
    a = scan.nextInt();
    System.out.println("Enter a value for B:");
    b = scan.nextInt();
    
    for (int i=0 ; i<n.length ; i++)
    {
      if (a==n[i])
      {
          n[i]=b;
      }
    }
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println(n[i]);
    }
    
  }
}