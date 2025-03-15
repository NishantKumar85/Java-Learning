import java.util.Scanner;
public class Challengs15
{
    public static void main(String[]args)
{
 System.out.println("welcom to chesck number is + or - or 0\n");
Scanner input=new Scanner(System.in);
System.out.println("Enter your number: ");
int Num=input.nextInt();

if(Num>0)
{
    System.out.println("number is positive : "+Num);
}
else if(Num<0)
{
    System.out.println("number is negitive : "+ Num);
}
else
{
    System.out.println("number is zero : "+Num);
}
}
}