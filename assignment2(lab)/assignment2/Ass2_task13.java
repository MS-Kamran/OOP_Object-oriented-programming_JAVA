//Write a program which reads 5 numbers into an array and prints the largest number and its location in the array//

import java.util.Scanner;

public class Ass2_task13 {
  public static void main(String []args) {
    
    int a[]=new int[5]; 
    int max = a[0];
    int i,l=0;
    
    for (i=0 ; i<a.length ; i++)
    {
      Scanner scan = new Scanner(System.in);
      System.out.println(i+1+")Enter Values For Store in Array");
      a[i]=scan.nextInt();
      
      if (max<a[i])
            {
                max=a[i];
                l=i;
            }
    }
    System.out.println("The largest Number is: "+max);
    System.out.println("The Location of The Largest Number: "+(l+1));
  }
}