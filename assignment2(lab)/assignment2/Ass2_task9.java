/*Write a java program that reads 10 numbers from the user. Then read another number from the user, 
 * and print “yes” if this number exists among the first 10. Print “no” otherwise.*/

import java.util.Scanner;

public class Ass2_task9 {
  public static void main (String args[] ){
      
    boolean find = false; 
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println("ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
    }
    
    System.out.println("ENTER A STORED VALUE FOR FIND:");
    int x = scan.nextInt();
    
    for (int i=0 ; i<n.length ; i++)
    {
      if (n[i]==x)
      {
          find = true;
      }
    }
    
    if (find == true)
    {
        System.out.println("Yes this number exists among the array");
    }
    else 
    {
        System.out.println("NO this number doen't exists among the array");
    }
  }
}