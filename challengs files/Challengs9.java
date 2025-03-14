import java.util.Scanner;


public class Challengs9
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
    
        System.out.println("enter the number1:");
        float a=input.nextFloat();
        System.out.println("enter the number2:");
        float b=input.nextFloat();
         
        System.out.println("arithmatic operation:");

        float product=a*b;

        System.out.println("Product of two number:"+product);
         
    }
}