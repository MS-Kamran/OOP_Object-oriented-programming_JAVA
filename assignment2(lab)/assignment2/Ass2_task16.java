/*Write a program which reads 5 numbers into an array, sorts/arranges the numbers from high to low and prints 
all numbers in the array.*/

//SELECTION SORTING//

import java.util.Scanner;

public class Ass2_task16 {
  public static void main(String []args) {
    
    int a[]=new int[5];
    Scanner scan = new Scanner(System.in);
    int i,j;
    
    for (i=0 ; i<a.length ; i++)
    {
      System.out.println("Enter Values For Store in Array");
      a[i]=scan.nextInt();
    }
    
    int minIndex;
    
    for (i=0 ; i<a.length-1 ; i++)
    {
      minIndex = i;
      for (j=i+1 ; j<a.length; j++)
      {
        if (a[j]>a[minIndex])
        {
          minIndex=j;
        }
      }
      int temp = a[i];
      a[i] = a[minIndex];
      a[minIndex] = temp;
    }
    
    for (i=0 ; i<a.length ; i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }
}
