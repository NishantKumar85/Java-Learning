import java.util.Scanner;
public class Challengs19
{
    public static void main(String[]args)
    {
        System.out.println("Welcom to gread system : ");
        System.out.println("Enter your percentage: ");
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();

        if(a>=90)
        {
        System.out.println("A :"+a);
        }
        else if(a>=75)
        {
            System.out.println("B:"+a);
        }
        else if(a>=60)
        {
        System.out.println("C :"+a);
        }
        else if(a>=30)
        {
            System.out.println("D:"+a);
        }
        else
        {
            System.out.println(" F:"+a);
        }

    }
}