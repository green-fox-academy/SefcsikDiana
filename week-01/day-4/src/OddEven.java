import java.util.Scanner;

public class OddEven {
    // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
    public static void main(String[] args) {
        int number;
        System.out.println("Enter an integer to check if it is odd or even");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");
    }
}