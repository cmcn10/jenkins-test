// Unit test file for NumberGuessing.java
public class NumberGuessingTest {
    public static void main(String[] args) {
        boolean allPassed = true;

        if (NumberGuessing.checkGuess(50, 50) != 0) allPassed = false;
        if (NumberGuessing.checkGuess(30, 50) != -1) allPassed = false;
        if (NumberGuessing.checkGuess(70, 50) != 1) allPassed = false;

        if (allPassed) {
            System.out.println("All tests passed.");
        } else {
            System.out.println("Test failed.");
        }
    }
}
