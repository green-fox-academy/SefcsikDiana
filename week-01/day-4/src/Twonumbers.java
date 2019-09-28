public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        int number1 = 22;
        int number2 = 13;

        // Print the result of 13 added to 22
        int added = number1 + number2;

        // Print the result of 13 substracted from 22
        int substracted = number1 - number2;

        // Print the result of 22 multiplied by 13
        int multiplied = number1 * number2;

        // Print the result of 22 divided by 13 (as a decimal fraction)
        double divided = number1 / number2;

        // Print the integer part of 22 divided by 13
        int divided2 = number1 / number2;

        // Print the remainder of 22 divided by 13
        int remainder = number1 % number2;

        System.out.println("added = " + added);
        System.out.println();
        System.out.println("substracted = " + substracted);
        System.out.println();
        System.out.println("multiplied = " + multiplied);
        System.out.println();
        System.out.println("divided = " + divided);
        System.out.println();
        System.out.println("divided2 = " + divided2);
        System.out.println();
        System.out.println("remainder = " + remainder);
    }
}
