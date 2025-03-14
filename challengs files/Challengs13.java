import java.util.Scanner;

public  class Challengs13
{
    public static void main(String[]args)
    {
        System.out.println("welcom compound intrest calculator:\n");
        Scanner input= new Scanner(System.in);
        System.out.println("enter the principal amount:");
        double P= input.nextDouble();
        System.out.println("enter the rate of intrest:");
        double R= input.nextDouble();
        System.out.println("enter the time period:") ;
        double T = input.nextDouble();
        double cs = P*Math.pow((1+R/100),T);   // p * (1 + r/100) ^ t    // Math.pow((1+R/100),T)
        System.out.println("Compound intrest is: "+ Math.round(cs));
    }
}
