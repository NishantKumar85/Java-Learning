import java.util.Scanner;
public class Challengs18
{
    public static void main(String[]args)
    {
        System.out.println("welcome to check leap year or not : \n");
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the year :");
        int a=input.nextInt();

        if(a%400==0 ||(a%4==0 && a%100!=0))
        {
        System.out.println("leap year :");
        }
        else
        {
        System.out.println("not leap year :");
        }
    }
}