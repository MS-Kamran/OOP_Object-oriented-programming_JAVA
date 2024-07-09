//Write a java program that reads 10 numbers from the user and prints the first even number in the list.//

import java.util.Scanner;

public class Ass2_task5 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    int even=0;
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println("ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
    }
    
    for (int i=0 ; i<n.length ; i++)
    {
      if (n[i]%2==0)
      {
        even = n[i];
        break;
      }
    }
    System.out.println("The First Even Number is:"+even);
  }
}