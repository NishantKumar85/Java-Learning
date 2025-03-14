import java.util.Scanner;
public class Challengs6
{
public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("welcom to our calculater");
        System.out.println("Please entere first numer:");
        int firstNum =input.nextInt();
        System.out.println("Please enter second number:");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of two Number is: "+ sum+".");

    }
}