public class DoubleItems {
  // - Create an array variable named `numList`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Double all the values in the array
  public static void main(String[] args) {
    int[] numlist = {3, 4, 5, 6, 7};
    //              element != index szammal! hanem az array elemevel egyezik meg!
    for (int element : numlist) {
      element = element * 2;
      //element = numlist[i] az elozo megoldasbol!
      System.out.println(element);
    }
  }
}

//  public static void main(String[] args) {
//    int[] numlist = {3, 4, 5, 6, 7};
//    System.out.println("The doubled values array of numlist: ");
//    for (int i = 0; i < numlist.length ; i++) {
//     numlist[i] = numlist[i]*2;
//      System.out.print(numlist[i] + " ");
//    }
//  }
//}

//  gyakorlas:
//  public static void main(String[] args) {
//    double[] numlist = {2.3, 4.5, 5.6};
//    for ( double element :numlist) {
//      element = element * 2;
//      System.out.print(element + " ");
//    }
//  }
//}
