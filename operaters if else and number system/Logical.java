import java.util.Scanner;


    public class Logical
    {
        public static void main(String[]args)
        {
        System.out.println("welcom to calculation:");

        Scanner input = new Scanner(System.in);
        System.out.println("welcom to discount : ");
        System.out.println("pelase enter your age: ");
        int age =input.nextInt();
        System.out.println("Are you a female? (true/false)");
        boolean isFemale= input.nextBoolean();

        if(age<5)
         {
            System.out.println("you got 75% discount: ");
         }
        else if(isFemale)
        {
                System.out.println("you got 50% discount: ");
        }
        else if(age>60 && !isFemale)
        {
            System.out.println("you got 25% discount: ");
        }
        else
        {
            System.out.println("you got no discount; ");
        }
    }
}