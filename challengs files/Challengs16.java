import java.util.Scanner;
public class Challengs16
{
    public static void main(String[]args)
    {
        System.out.println("welcom to check even or odd :\n");
        Scanner input= new Scanner(System.in);
        System.out.println("nter the number : ");
        long num = input.nextLong();
        
        if (num%2==0)
        {
            System.out.println("number is even: "+ num);
        }
        else 
        {
            System.out.println("number is odd: "+num);
        }
    }
}