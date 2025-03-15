import java.util.Scanner;
public class loop
{
    public static void main(String[] args)
    {
       /* int num =1; // initialization.
        while(num<=100)//condition
        {
            System.out.println(num);
            num=num+1;
        }*/
        // int count=500;
        // while (count>=200)
        // {
        //     System.out.println(count);
        //     count=count-1;
        // }
        Scanner input=new Scanner(System.in);
        
        int i =0; //initilization
        while (i<5)//condition
        {
            int a= input.nextInt();
            System.out.println("enter number:  "+a);
            i++;//updation
            
        }
    }
}