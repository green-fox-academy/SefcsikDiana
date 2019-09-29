public class PrintElements {
  // - Create an array variable named `numbers`
  //   with the following content: `[4, 5, 6, 7]`
  // - Print all the elements of `numbers`
  public static void main(String[] args) {
    System.out.println("The all elements of numbers array is:");
    int[] numbers = {4, 5, 6, 7};
    for (int i = 0; i <numbers.length ; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
