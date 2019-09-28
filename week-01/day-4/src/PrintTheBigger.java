import java.util.Scanner;

public class PrintTheBigger {
  // Write a program that asks for two numbers and prints the bigger one
  public static void main(String[] args) {
    System.out.println("Give me two numbers: ");
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    if (number1 > number2){
      System.out.println(number1);
    } else System.out.println(number2);
  }
}
