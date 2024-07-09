/*Write a program which reads 5 numbers into an array and prints the largest number.  If the user enters 
 7, 13, 2, 10, 6 then your program should print 13*/

import java.util.Scanner;

public class Ass2_task12 {
  public static void main(String []args) {
    
    int a[]=new int[5]; 
    int max = a[0];
    int i;
    
    for (i=0 ; i<a.length ; i++)
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Values For Store in Array");
      a[i]=scan.nextInt();
      
      if (max<a[i])
            {
                max=a[i];
            }
    }
    System.out.println("The largest Number is: "+max);
  }
}
