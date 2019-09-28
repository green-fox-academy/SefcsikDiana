import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a distance in mile: ");
  double number = scanner.nextDouble();
  double result = number * 0.62;
    System.out.println("The " + number + " mile is " + result + "km.");
  }
}
