import java.util.Scanner;

public class OddEven {
  // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
  public static void main(String[] args) {
    System.out.println("Give me a number: ");
    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();

    if (inputNumber % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}
