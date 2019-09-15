import javax.swing.*;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner myscan = new Scanner(System.in);
        double pi = myscan.nextDouble() ;

        System.out.println(pi * 1.6 + "km");

    }

}


/*Scanner myscan = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = myscan.nextLine();
        System.out.println("SziaMia:" + name);


        System.out.println("What is your age?");
        int age = myscan.nextInt();
        System.out.println("What??? " + age + " Just kidding!");

    }
 } */