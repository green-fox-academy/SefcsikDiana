import java.util.Scanner;

public class AverageOfInput {
  // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
// Sum: 22, Average: 4.4
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give me numbers in a row: ");
    int number = scanner.nextInt();

    int sum = 0;

    for (int i = 0; i < number; i++) {
      sum += scanner.nextInt();
    }
    double average = (double) sum / number;

    System.out.print("Sum: " + sum + ", Average: " + average);

  }
}
//
//    int sum = sumAndAverage(number);
//    int average = sumAndAverage(number);
//    System.out.print("Sum: " + sum + "Average: " + average);
//
//  }
//
//  private static int sumAndAverage(int numbers) {
//    int result = 0;
//    for (int i = 0; i <= numbers ; i++) {
//      result += i;
//    }
//    return result;
//  }

