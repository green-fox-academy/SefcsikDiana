public class Swapelements {
  // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
  public static void main(String[] args) {
    System.out.println("The Array of abc: ");

    String[] abc = {"first", "second", "third"};
    String cba = abc[0];
    abc [0] = abc[2];
    abc [2] = cba;
//    for (int index = 0; index < abc.length ; index++) {
//      System.out.println(abc[index]);
//    }
    for (String element : abc){
      System.out.println(element);
    }
  }
}


