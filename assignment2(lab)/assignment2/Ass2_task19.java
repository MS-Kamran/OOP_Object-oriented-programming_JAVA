/*Create a String array (size 10) consisting of the words “zero”, “one”, “two”……, “nine”. Then take a number 
(between 0 and 9) from the user and print that number in words from the array. If the user enters 5, you should print 
a[5] and output should be “five”.*/

import java.util.Scanner;

public class Ass2_task19 {
  public static void main(String []args) {
    
    String a[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}; 
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Values");
    int n=scan.nextInt();
    
    System.out.println(a[n-1]);
  }
}
