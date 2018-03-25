// home work: custom size asterisks square based on user input as a function
// javac helloastplusfunc.java && java helloastplusfunc

import java.util.Scanner;

public class L024_userInputToAsteriskSquare {

    public static void main(String[] args) {

        userInputToAsteriskSquare(new Scanner(System.in).nextInt());

    }

    public static void userInputToAsteriskSquare (int size) {

        for (int i = 0; i < size; i ++) {

            for (int j = 0; j < size; j ++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }


}
