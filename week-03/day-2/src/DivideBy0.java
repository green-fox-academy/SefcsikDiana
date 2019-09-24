import java.util.Scanner;

public class DivideBy0 {
  // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

  public static void main(String[] args) {
    printDivisionResult(5); // itt adom meg a functionnel, a bekert szamot!!! barmire atirhatom!
  }
  public static void printDivisionResult(int input) {
    try {
      System.out.println(10 / input); // itt muszaj letrehoznom, hogy nyomtass ki a resultot a tryon belul!!!
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
 /* NEM JO MEGOLDAS!!!!!!!!!!! TUL SOK, NEM KELL SCANNER!!!
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number: ");
    int number = scanner.nextInt();
    function(number);
  }

  public static void function (int divider){

    try {
      int result = 10 / divider;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
} */
