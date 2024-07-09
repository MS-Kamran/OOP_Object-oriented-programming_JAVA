/*Write a java program that would input three numbers from the user and print sum, then the first number, 
 * then the 2nd number followed by 3rd number. If user enters 10, 20, 30. Then output should be 60, 10, 20, and 
 * 30.*/

import java.util.Scanner;

public class Ass2_task1 {
  public static void main (String args[] ){
    
    int[] n = new int[3];
    Scanner scan = new Scanner (System.in);
    int sum=0;
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println("ENTER A NUMBER:");
      n[i] = scan.nextInt();
      sum = sum + n[i];
    }
    System.out.println("SUM="+sum);
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println(n[i]);
    }
  }
}