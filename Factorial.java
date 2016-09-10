import java.util.Scanner;

public class Factorial 
{
 public static void main(string [] args)
 {
    int num,fact = 1,i;
    System.out.println("Enter the number:");
    Scanner in = new Scanner(System.in);
      num = in.nextInt();
       for(i = 1; i <= num;i++)
       {
         fact = fact * i;
         }
    System.out.println("Factorial Number is" + fact);
    }
  }
