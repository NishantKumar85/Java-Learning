import java.util.Scanner;

public class Challengs11
{
    public static void main(String[]args)
    {

    System.out.println("welcome the Area of traingle\n");

    Scanner input= new Scanner(System.in);
    System.out.println("enter the base of traingle:");
    double a= input.nextDouble();
    System.out.println("enter the height of traingle:");
    double b= input.nextDouble();
    double area= (a*b)/2;
    System.out.println("Area of traingle:\n"+area);

    }
}