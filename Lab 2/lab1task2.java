/*2. Write a Java program that will ask the user to enter 10 numbers and will verify the users input after each 
entry. For example if the user enters 2, the program will print “You have entered 2”,then if the user enters 4 
the program will print “You have entered 2, 4”, then if the user enters 23 the program will print “You have 
entered 2, 4 , 23”. This will go on till the user enters the 10 numbers.*/

import java.util.Scanner;

public class lab1task2 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    for (int i=0 ; i<n.length ; i++)
    {
      n[i] = scan.nextInt();
      
      System.out.print("You have entered :");
      for (int j=0 ; j<=i ; j++)
      {
          System.out.print(" "+n[j] );          
      }
      System.out.println();
    }
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println(n[i]);
    }
  }
}