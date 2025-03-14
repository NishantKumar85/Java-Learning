 import java.util.Scanner;
 public class UserINPUT1
 {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a name: ");
            String name = input.nextLine();
            System.out.println("Goog morning" + name);
            System.out.println(name+"'Also tell me your age: ");
            int age = input.nextInt();
            System.out.println("You are " + age + " years old");
        }
    }
 }