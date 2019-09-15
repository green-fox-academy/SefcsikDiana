import java.util.stream.IntStream;

public class practise7 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = IntStream.of(numbers).sum();
        System.out.println("The sum is " + sum);
    }
}
