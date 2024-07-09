/*Write a java program that reads 15 numbers from the user, all the numbers within the range 0-9. Then print 
the number of times each number has been entered by the user*/

import java.util.Scanner;

public class Ass2_task20 {
  public static void main(String []args) {
    
    int a[] = new int[10];
    Scanner scan = new Scanner(System.in);
    
    for (int i=1 ; i<=15 ; i++)
    {
      System.out.println(i+")Enter Values For Store in Array (with in 0-9):");
      int n = scan.nextInt();
      
      for (int j=0 ; j<a.length ; j++)
      {
          if (n==j)
          {
              a[j]++; 
          }
      }
    }
    for(int i=0 ; i<a.length ; i++)
    {
        System.out.println("Number "+i+" enters "+a[i]+" times");
    }
  }
}