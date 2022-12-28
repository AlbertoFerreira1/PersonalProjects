import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println("Enter your guess between 0 and 100:");
        int randomNumber = rand.nextInt(100 + 1);

        while (true) {


            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();

            if (playerGuess == randomNumber) {
                System.out.println("You guessed it, congratulations");
                break;
            } else if (playerGuess > randomNumber) {
                System.out.println("The number you want to guess is lower than " + playerGuess);
                System.out.print("Try again: ");

            } else {
                System.out.println("The number you want to guess is bigger than " + playerGuess);
                System.out.print("Try Again: ");
            }
        }
    }
}

