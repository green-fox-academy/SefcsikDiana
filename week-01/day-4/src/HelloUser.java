import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = myscan.nextLine();
        System.out.println("SziaMia:" + name);


        System.out.println("What is your age?");
        int age = myscan.nextInt();
        System.out.println("What??? " + age + " Just kidding!");

    }
 }
 /*
         Modify this program to greet user instead of the World!
         The program should ask for the name of the user
        System.out.println("Hello, World!"); */






