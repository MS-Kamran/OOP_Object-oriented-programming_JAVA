/*Write a java program that reads 10 numbers from the user, and then prints only the even numbers in 
reverse order.*/

import java.util.Scanner;

public class Ass2_task8 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    int i;
    
    for (i=0 ; i<n.length ; i++)
    {
      System.out.println(i+")ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
    }
    
    for (int j=i-1 ; j>0 ; j--)
    {
      if (n[j]%2==0)
      {
          System.out.print(n[j]+", ");
      }
    }
    System.out.println();
  }
}