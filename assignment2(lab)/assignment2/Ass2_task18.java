/*Write a java program that reads 10 numbers from the user. Write the program in such a way so that If the user 
enters 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, then the output should be 10, 30, 50, 70, 90, 20, 40, 60, 80, 100.*/

import java.util.Scanner;

class Ass2_task18 {
    public static void main (String[] args) {
      
      int a[]=new int[10]; 
      
      for (int i=0 ; i<a.length ; i++)
      {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter Values For Store in Array");
          a[i]=scan.nextInt();
      }
        
      for (int i=0 ; i<a.length ; i=i+2)
      {
        System.out.print(a[i]+" ,");
      }
      for (int i=1 ; i<a.length ; i=i+2)
      {
        System.out.print(a[i]+" ,");
      }
      System.out.println();
        
    }
}
