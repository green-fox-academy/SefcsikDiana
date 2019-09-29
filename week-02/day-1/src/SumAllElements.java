public class SumAllElements {
  // - Create an array variable named `ai`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Print the sum of the elements in `ai`
  public static void main(String[] args) {
    int [] ai = {3, 4, 5, 6, 7};
    int sum = 0;
    System.out.println("The sum of the elements in 'ai' array: ");
    for (int index = 0; index < ai.length ; index++) {
     sum += ai[index];
    }
    System.out.println(sum);
  }
}
