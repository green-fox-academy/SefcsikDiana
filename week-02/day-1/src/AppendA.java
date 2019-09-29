public class AppendA {
  //  Create the usual class wrapper
  //  and main method on your own.
  // - Create a string variable named `typo` and assign the value `Chinchill` to it
  // - Write a function called `appendAFunc` that gets a string as an input,
  //   appends an 'a' character to its end and returns with a string
  // - Print the result of `appendAFunc(typo)
  public static void main(String[] args) {
    String typo = "Chinchill";
    String typo2 = "Kuty";
    String typo3 = "Macsk";
    System.out.println(appendAFunc(typo));
    System.out.println(appendAFunc(typo2));
    System.out.println(appendAFunc(typo3));
  }
  private static String appendAFunc(String word){
    String correctWord = word + "a";
    return correctWord;
 }
}
