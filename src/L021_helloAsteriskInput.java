// home work: custom asterisks based on user input
// javac helloastplus.java && java helloAsteriskInput

import java.util.Scanner;

public class L021_helloAsteriskInput {

    public static void main(String[] args) {

        int input = new Scanner(System.in).nextInt();

        for (int i = 0; i < input; i++) {

            for (int j = 0; j < input; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }

}

