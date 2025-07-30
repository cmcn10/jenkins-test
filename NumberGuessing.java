import java.util.Scanner;

public class NumberGuessing {

    // Testable method for unit test
    public static int checkGuess(int guess, int actual) {
        if (guess == actual) return 0;
        return (guess < actual) ? -1 : 1;
    }

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 5;

        System.out.println("A number is chosen between 1 and 100.");
        System.out.println("You have " + K + " attempts to guess the correct number.");

        for (int i = 0; i < K; i++) {
            System.out.print("Enter your guess: ");
            try {
                int guess = sc.nextInt();
                int result = checkGuess(guess, number);

                if (result == 0) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    sc.close();
                    return;
                } else if (result < 0) {
                    System.out.println("The number is greater than " + guess);
                } else {
                    System.out.println("The number is less than " + guess);
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next(); // Clear invalid input
            }
        }

        System.out.println("You've exhausted all attempts. The correct number was: " + number);
        sc.close();
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}
