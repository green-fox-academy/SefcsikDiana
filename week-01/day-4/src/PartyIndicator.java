import java.util.Scanner;

public class PartyIndicator {
  // Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
  public static void main(String[] args) {
    int numberOfGirls;
    int numberOfBoys;

    System.out.println("Number of the girls at the party");
    Scanner in = new Scanner(System.in);
    numberOfGirls = in.nextInt();
    System.out.println("Number of the boys at the party");
    numberOfBoys = in.nextInt();

    int numberOfPeople = numberOfGirls + numberOfBoys;
    //It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    if (numberOfGirls == numberOfBoys && numberOfPeople >= 20) {
      System.out.println("The party is excellent!");
      //It should print: Quite cool party!
      // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    } else if (numberOfPeople >= 20 && numberOfGirls != numberOfBoys) {
      System.out.println("Quite cool party!");
    }
    // It should print: Average party...
    // If there are less people coming than 20
    else if(numberOfGirls != 0){
      // Masik megoldas else if ((numberOfPeople < 20 && numberOfGirls == numberOfBoys) || numberOfGirls != numberOfBoys)
      System.out.println("Average party...");
    }
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    else if (numberOfGirls == 0) {
      System.out.println("Sausage party");
    }
  }
}