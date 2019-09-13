
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int DaySeconds = 86400;
        int remainingSconds = 86400 - 14 * 60 * 60 + 34 * 60 + 42;
        System.out.println(remainingSconds);
        
    }
}