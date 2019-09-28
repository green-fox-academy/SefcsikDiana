public class VariableMutation {
  // osztalyneve mindig nagy betuvel kezdjuk!!!
  public static void main(String[] args) {

    // make the "a" variable's value bigger by 10
    int a = 3;
    a += 10;
    System.out.println("a = " + a);
    System.out.println();

    // make b smaller by 7
    int b = 100;
    b -= 7;
    System.out.println("b = " + b);
    System.out.println();

// please double c's value
    int c = 44;
    c *= c;
    System.out.println("c = " + c);
    System.out.println();

    // please divide by 5 d's value
    int d = 125;
    d /= 5;
    System.out.println("d = " + d);
    System.out.println();

    // please cube of e's value
    int e = 8;
    e *= e;
    System.out.println("e = " + e);
    System.out.println();

    // tell if f1 is bigger than f2 (print as a boolean)
    int f1 = 123;
    int f2 = 345;
    String message = (f1 > f2) ? "f1 is bigger than f2" : "f2 is bigger than f1";
    System.out.println(message);
  /* 2. megoldas :
    if (f1 > f2){
    System.out.println("f1 is bigger than f2");
  } else System.out.println("f2 is bigger than f1"); */


  /* 3. megoldas :
    boolean f1IsBigger = f1 > f2;
    System.out.println("F1 is bigger than f2: " + f1IsBigger + "\n"); */

    // tell if the double of g2 is bigger than g1 (print as a boolean)
    int g1 = 350;
    int g2 = 200;
    boolean g2IsBigger = g2 * 2 > g1;
    System.out.println("The double of g2 is: " + g2IsBigger + "\n");

    // tell if it has 11 as a divisor (print as a boolean)
    int h = 135798745;
    boolean isDivisor = h % 11 == 0;
    System.out.println("h has 11 as a divisor: " + isDivisor + "\n");

    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    int i1 = 10;
    int i2 = 3;
    double i2Cube = Math.pow(i2, 3);
    // powOf = hatvanyozas (i2 ertek, hanyadikra szeretnem emelni, itt harmadikra emelem!!!)
    System.out.println(i2Cube);
    boolean statementIsTrue = i1 > (i2 * i2) && i1 < (i2Cube);
    System.out.println(statementIsTrue);

    // tell if j is dividable by 3 or 5 (print as a boolean)
    int j = 1521;
    boolean dividable = j % 3 == 0 || j % 5 == 0;
    System.out.println("j is dividable by 3 or 5:" + dividable);
    // amikor azt vizsgalom, hogy oszthato vmivel

  }
}