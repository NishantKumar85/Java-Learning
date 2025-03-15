import java.util.Scanner;
public class Challengs20
{
    public static void main(String[]args)
    {
        System.out.println("Welcom to Age group : ");
        System.out.println("Enter your Age : ");
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();

        if(a>=60)
        {
        System.out.println("Senior :"+a);
        }
        else if(a<=60)
        {
            System.out.println("Adult:"+a);
        }
        else if(a<=20)
        {
        System.out.println("Teen :"+a);
        }
        else
        {
            System.out.println(" child:"+a);
        }

    }
}