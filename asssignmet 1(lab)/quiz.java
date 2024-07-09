import java.util.Scanner;

public class quiz {
  public static void main (String [] args){
    
    Scanner scan = new Scanner (System.in);
    System.out.println("ENTER A NUMBER:");
    int n = scan.nextInt();
    
    for (int r=1 ; r<=n ; r++)
    {
      for (int c=1 ; c<=n ; c++)
      {
        if (r==1 || c==1 ||r==c )
        {
          System.out.print("*");
        }
        else 
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}