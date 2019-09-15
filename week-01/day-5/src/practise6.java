import java.util.stream.IntStream;

public class practise6 {
    public static void main(String[] args) {
        int[] tomb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = IntStream.of(tomb).sum();
        System.out.println("The sum is " + sum);
    }
}

    /*public static void main(String[] args) {
        //Osszegzes tematika
        int [] tomb = {10,20,30,40,50};
        int sum = IntStream.of(tomb).sum();
        System.out.println("The sum is " + sum);
     }
}
     */

