package gardenapplication;

public class Tree {
  private String color;
  private double currentWaterAmount;
  private double absorbPercent = 0.4;

  public Tree(String color, double currentWaterAmount) {
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
    if (currentWaterAmount < 10) {
      return true;
    } else {
      return false;
    }
  }

  public void water(int waterAmount){
    if (currentWaterAmount < 10) {
      currentWaterAmount += waterAmount*absorbPercent;
    }
  }
}
