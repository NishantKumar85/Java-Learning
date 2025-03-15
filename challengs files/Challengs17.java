import java.util.Scanner;
public class Challengs17
{
    public static void main(String[] args) {
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the first number : ");
            long a= input.nextLong();
            System.out.println("Enter the Second number : ");
            long b=input.nextLong();
            System.out.println("Enter the third number : ");
            long c=input.nextLong();

            if(a>b)
            {
             if(a>c)
             {
                System.out.println(" big number : "+a);
             }
             else
             {
                System.out.println("big number : "+c);
             }
            }
           else
           System.out.println("big number : "+b); 
           }
    }
}