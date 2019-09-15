public class DrawTriangle {
    public static void main(String[] args) {
        String a = "*";
        int numberOfLines = 10;

        for (int i = 1; i <= numberOfLines; i++){
            System.out.println(a);
            a = a + "*";
        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
// The triangle should have as many lines as the number was

