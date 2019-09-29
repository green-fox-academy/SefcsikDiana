import java.util.Scanner;

public class Factorial {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `factorio`
    //   that returns it's input's factorial
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me a random number: ");
    int userInput = scanner.nextInt();
    int yeah = functionfactorio(userInput);
    System.out.println("Factorial of " + userInput + " is: " + yeah);
  }

  private static int functionfactorio(int newNumber) {
    int realSolution = 1;
    for (int number = 1; number <= newNumber; number++) {
      realSolution *= number;
    }
    return realSolution;
  }
}
