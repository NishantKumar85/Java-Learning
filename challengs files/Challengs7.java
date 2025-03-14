 import java.util.Scanner;
 public class Challengs7
 {
     public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("welcom to swapping\n\n");
        System.out.println("Enter value of A: ");
        int a =input.nextInt();
        System.out.println("Enter value of B: ");
        int b =input.nextInt();
      
      int c=a;a=b;
        b=c;
        System.out.println("swapping done....");
      System.out.println("value of A is = "+a);
      System.out.println("value of B is = "+b);
     }
 }