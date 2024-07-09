/*Write a java program that reads 10 numbers from the user. After reading each number, 
 print all the numbers that have been entered so far.*/

import java.util.Scanner;

public class Ass2_task10 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println(i+1+")ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
      
      for (int j=0 ; j<=i ; j++)
      {
          System.out.print(n[j]+", ");
      }
      System.out.println();
      System.out.println();
    }
  }
}
