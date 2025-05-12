import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        
        Hello hi = new Hello(name);
        
        hi.english();
        hi.spanish();
        hi.french();

    }
}