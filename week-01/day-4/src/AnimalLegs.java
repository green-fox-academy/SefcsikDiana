import java.util.Scanner;

public class AnimalLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner scanner = new Scanner(System.in);
    System.out.print("The number of chicken: ");
    int chicken = scanner.nextInt();
    System.out.print("The number of pigs: ");
    int pigs = scanner.nextInt();
    int animalsLegs= (chicken*2) + (pigs*4);
    int result = animalsLegs;
    System.out.println();
    System.out.println("The number of legs are " + result + ".");
  }
}
