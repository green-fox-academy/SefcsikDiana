public class SecondsInADay {
  public static void main(String[] args) {
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int remainingSeconds = 24*3600-(14*3600)+(34*60)-42;
    System.out.println("The remaining seconds from this day is " + remainingSeconds);

  }
}
