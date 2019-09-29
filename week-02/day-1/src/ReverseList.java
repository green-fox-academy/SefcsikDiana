public class ReverseList {
  // - Create an array variable named `aj`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Reverse the order of the elements in `aj`
  // - Print the elements of the reversed `aj`
  public static void main(String[] args) {
    int [] aj = {3, 4, 5, 6, 7};
    for (int index = 4; index >= 0; index--) {
      System.out.println(aj[index]);
    }
  }
}
// for ciklusban csokkentem 1gyel az indexet, igy haladok visszafele index--
// mivel csak a nulladik indexu elemig szeretnem h fusson a for ciklus, igy index >=0, ezt kell alkalmazzam"
