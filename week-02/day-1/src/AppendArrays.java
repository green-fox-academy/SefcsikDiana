public class AppendA {
  // - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
  public static void main(String[] args) {
    String[] animals = {"koal", "pand", "zebr"};
    System.out.println("Array of animals: ");
    for (String element : animals){
      element = element + "a";
      System.out.println(element);
    }
  }
}
