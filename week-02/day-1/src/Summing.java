import java.util.Scanner;

public class Summing {
  // Create the usual class wrapper and main method on your own.
  // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
  public static void main(String[] args) {
    System.out.println("Give a random number: ");
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
    int solution = sum(userInput);
    System.out.println("The solution is " + solution + ".");
  }
  public static int sum(int randomNumber) {
    int result = 0;
    for (int number = 0; number <= randomNumber ; number++) {
      result += number;
    }
    return result;
  }
}