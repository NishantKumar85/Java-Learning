import java.util.Scanner;

public class Challengs10

{
    public static void main(String[]args)
    {
    Scanner input= new Scanner(System.in);
    System.out.println("enter the first sird of rectangle:");
    double a= input.nextDouble();
    System.out.println("enter the second side of rectangle:");
    double b= input.nextDouble();
    System.out.println("enter the third side of rectangle:");
    double c= input.nextDouble();
    System.out.println("enter the fourth side of rectangle:");
    double d= input.nextDouble();
    double parimeter=a+b+c+d;
    System.out.println("parimeter of rectangle:"+parimeter);


    }
}