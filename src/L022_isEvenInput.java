import java.util.Scanner;

public class L022_isEvenInput {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        // System.out.println("Hello, World");

        System.out.println("Enter an Integer");
        int input = new Scanner(System.in).nextInt();
        System.out.println("You entered integer "+input);

        System.out.println("Is even: " + isEven(input));

    }

    public static boolean isEven(int a) {

        return a % 2 == 0;

    }


}