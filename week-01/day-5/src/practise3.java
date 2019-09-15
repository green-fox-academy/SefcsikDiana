import java.util.Scanner;

public class practise3 {
    public static void main(String[] args) {
        // Ask for a name and handle some mentor names
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a name");
        String name = scanner.next();
        String output = "";


        switch (name) {
            case "Marci":
                output = "Hianyzol!";
                break;
            case "Dia":
                output = "Never give up!";
                break;
            case "Lili":
                output = "Dont worry be, Happy!";
                break;
            default:
                output = "Get out of the room";

        }
        System.out.println(output);
    }
}
