package sharpie;

public class MainSharpie {
  public static void main(String[] args) {
    Sharpie sharpie1= new Sharpie("blue",15.2F);
    System.out.println(sharpie1.color);
    sharpie1.use();
    System.out.println(sharpie1.minkAmount());
    Sharpie sharpie2 = new Sharpie("yellow", 10.34F);
  }
}
