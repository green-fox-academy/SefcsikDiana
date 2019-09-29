import java.util.Scanner;

public class Greeting {
    //  From now on, create the usual class wrapper
//  and main method on your own.
// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`
    public static void main(String[] args) {
        Scanner newName = new Scanner(System.in);
        System.out.println("Please give me a name: ");
        String al = newName.next();
        System.out.println(greet(al));
    }

    private static String greet(String randomName) {
        String solution = "Greeting Dear, " + randomName + "!";
        return solution;
    }
}
 /* public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a name: ");

    String al = scanner.next();
    System.out.println(greet(al));
  }
  private static String greet(String al){
      String result = "Greetings Dear, " + al + "!";
      return result;
  }
} */
