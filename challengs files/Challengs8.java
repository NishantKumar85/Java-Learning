import java.util.Scanner;
public class Challengs8
{
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number1:");
        int a=input.nextInt();
        System.out.println("enter the number2:");
        int b=input.nextInt();
        
        System.out.println("arithmatic operation:");

        int add=a+b;
        int sub =a-b;
        int multi=a*b;
        int div=a/b;
        int rem=a%b;

        System.out.println("addition:"+add);
        System.out.println("subtraction:"+sub);
        System.out.println("multiplication;"+multi);
        System.out.println("devision:"+div);
        System.out.println("reminder:"+rem);

    }
}