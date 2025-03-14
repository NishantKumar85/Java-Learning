import java.util.Scanner;

public class Challengs12
{
    public static void main(String[]args)
    {
        System.out.println("welcome to calculater");
        Scanner input =new Scanner(System.in);
        System.out.println("enter the principle amount:");
        double a =input.nextDouble();
        System.out.println("enter the rate of interest:");
        double b =input.nextDouble();
        System.out.println("enter the time period:");
        double c=input.nextDouble();
        double d=(a*b*c)/100;
        System.out.println("Simple interestis:"+d);
    }
}