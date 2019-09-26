package sharpie;
             //Create Sharpie class
public class Sharpie {
  String color;
  float width;
  static float inkAmount = 100;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;

  }
  public void use(){
    this.inkAmount -= 10;
  }
  public float minkAmount(){
    return this.inkAmount;
  }
}
