/*Write a java program that reads 10 numbers from the user. The program then reads a number between 
 * 0 to 9, and shows the number at the corresponding index number. For instance, if the array is a and the 
 * user enters 3, your program should print the value a[3].*/

import java.util.Scanner;

public class Ass2_task2 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println("ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
    }
    
    System.out.println("ENTER A INDEX NUMBER FOOR FIND THE VALUE:");
    int j = scan.nextInt();
    
    System.out.println("THE VALUE OF THE INDEX IS:"+n[j]);
  }
}