import java.util.Scanner;
public class Challangs14
{
    public static void main(String []args)
    {
        System.out.println("welcome to Fahrenheit converter:\n");
        Scanner input=new Scanner (System.in);
        double F=input.nextDouble();
        double C = (F-32)*5/9;
        System.out.println("Celsius : "+C+"C");

    }
}