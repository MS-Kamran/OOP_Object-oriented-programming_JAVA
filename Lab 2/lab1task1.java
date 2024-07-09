import java.util.Scanner;

public class lab1task1 {
  public static void main (String args[] ){
    
    int[] n = new int[10];
    Scanner scan = new Scanner (System.in);
    
    for (int i=0 ; i<n.length ; i++)
    {
      System.out.println("ENTER A VALUE FOR STORE:");
      n[i] = scan.nextInt();
    }
    
    for (int j=n.length-1 ; j>=0 ; j--)
    {
      System.out.println(n[j]);
    }
  }
}