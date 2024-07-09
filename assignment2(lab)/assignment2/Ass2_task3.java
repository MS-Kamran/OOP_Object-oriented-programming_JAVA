/*Write a java program that reads 10 numbers from the user, and then prints them in the reverse order.*/


import java.util.Scanner;

public class Ass2_task3 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println("ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
    }
    
    for (int j=n.length-1 ; j>=0 ; j--)
    {
      System.out.println(n[j]);
    }
  }
}