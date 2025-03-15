import java.util.Scanner;
public class voting
{
    public static void main(String [] args)
    {
        System.out.println("welcom to india election: \n");
        Scanner input =new Scanner(System.in);
        System.out.println("please enter your age: ");
        int age = input.nextInt();
        int eligible =18;
        
        if( age>=eligible)
             {
                System.out.println("you are eligible for voting: ");
             }
        else
            {
                System.out.println("sorry you are not eligible:\n ");
            }
     System.out.println("   ");
        
    }
}