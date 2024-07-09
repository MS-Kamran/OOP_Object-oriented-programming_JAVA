/*Write a java program that reads 10 numbers from the user, but does not allow the user to enter 
 duplicates. This means that if a number has been entered already, the program will not accept it as input again
 and instead ask the user to enter a different number.*/

import java.util.Scanner;

public class Ass2_task11 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println(i+1+")ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
      
      int c=0;
      
      for (int j=0 ; j<=i ; j++)
      {       
          if(n[i]==n[j])
          {
              c++;
          }
          if (c==2)
          {
              System.out.println("Enter a Different number:");
              n[i] = scan.nextInt();
          }
      }
    }
    
    System.out.println("The Inputes are:");
    for (int i=0 ; i<n.length ; i++)
    {
        System.out.print(n[i]+", ");
    }
    System.out.println();
  }
}