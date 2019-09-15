import java.util.Scanner;
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
public class CountFromtTo {
    public static void main(String[] args) {
        int askedNumber1;
        int askedNumber2;
        System.out.println("Give a number");
        Scanner in = new Scanner(System.in);
        askedNumber1 = in.nextInt();
        System.out.println("Give another number");
        askedNumber2 = in.nextInt();

        if (askedNumber2 < askedNumber1) {
            System.out.println("Second number should be bigger");
        }

        //   1.                     2.               3.
        for (int i = askedNumber1; i < askedNumber2; i++) {
            System.out.println(i);
        }
    }
}

    /*
        //1.
        int i= askedNumber1;

        //2.
        if(i<askedNumber2){
            System.out.println(i);
        }
        //3.
        i++;
        //2.
        if(i<askedNumber2){
            System.out.println(i);
        }
        //3.
        i++;

        if(i<askedNumber2){
            System.out.println(i);
        }

        i++;

        if(i<askedNumber2){
            System.out.println(i);
        }

        i++;
    }
} */


// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
