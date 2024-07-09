/*Write a program which reads 5 numbers into an array and prints the smallest and largest number and their 
location in the array.*/

import java.util.Scanner;

class Ass2_task14 {
    public static void main (String[] args) {
      
      int a[]=new int[5]; 
      
      for (int i=0 ; i<a.length ; i++)
      {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter Values For Store in Array");
          a[i]=scan.nextInt();
      }
        int max = a[0];
        int min = a[0];
        int s=0, l=0;
        
        for (int i=0 ; i<a.length ; i++)
        { 
            if (max<a[i])
            {
                max=a[i];
                l=i;
            }
            if (min>a[i])
            {
                min=a[i];
                s=i;
            }
        }
        System.out.println("The largest Number is "+max+" and its Location is "+(l+1));
        System.out.println("The Smallest Number is "+min+" and its location is "+(s+1));
    }
}
