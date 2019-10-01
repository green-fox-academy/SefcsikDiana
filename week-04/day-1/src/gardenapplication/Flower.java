package gardenapplication;

public class Flower {
  private String color;
  private double currentWaterAmount;
  private double absorbPercent = 0.75;

  public Flower(String color, double currentWaterAmount) {
    this.color = color;
    this.currentWaterAmount = currentWaterAmount;
  }

  public String getColor() {
    return color;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public Boolean getWaterStatus() {
    if (currentWaterAmount < 5) {
      return true;
    } else {
      return false;
    }
  }

  public void water(int waterAmount){
    if (currentWaterAmount < 5) {
      currentWaterAmount += waterAmount*absorbPercent;
    }
  }
}
