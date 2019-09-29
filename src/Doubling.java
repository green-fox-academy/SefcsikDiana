public class Practise8 {
  public static void main(String[] args) {
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
//- Print the result of `doubling(baseNum)`
int baseNum = 123;
int doublingBaseNum = doubling(baseNum);
    System.out.println(doublingBaseNum);
  }

  private static int doubling(int baseNum) {
    return baseNum * 2;
  }
}