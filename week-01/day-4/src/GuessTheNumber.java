import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
        int mySecretNumber = 6;
        System.out.println("Guess a number!");
        Scanner in = new Scanner(System.in);
        // vegtelenitett ciklus elso megoldas:
        // while (true) {}
        // masik megoldas
        for (;;){
            int number = in.nextInt();
            if (number < mySecretNumber) {
                System.out.println("The stored number is higher");
            } else if (number > mySecretNumber) {
                System.out.println("The stored number is lower");
            } else {
                System.out.println("You found my number:" + mySecretNumber);
                break; //megtori a ciklust es leallitja!
            }
        }

    }
}
