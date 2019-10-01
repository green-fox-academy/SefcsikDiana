package gardenapplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Tree> trees;
  private List<Flower> flowers;

  public Garden() {
    this.trees = new ArrayList<>();
    this.flowers = new ArrayList<>();
    flowers.add(new Flower("yellow", 4));
    flowers.add(new Flower("blue", 4));
    trees.add(new Tree("purple", 4));
    trees.add(new Tree("orange", 4));

  }

  public void print() {
    for (int i = 0; i < flowers.size(); i++) {
      Flower actualFlower = this.flowers.get(i);
      System.out.print("The " + actualFlower.getColor() + " " + actualFlower.getClass().getSimpleName());
      if (actualFlower.getWaterStatus()) {
        System.out.println(" needs water.");
      } else {
        System.out.println(" doesn`t need water.");
      }
    }
    for (int i = 0; i < trees.size(); i++) {
      Tree actualTree = this.trees.get(i);
      System.out.print("The " + actualTree.getColor() + " " + actualTree.getClass().getSimpleName());
      if (actualTree.getWaterStatus()) {
        System.out.println(" needs water.");
      } else {
        System.out.println(" doesn`t need water.");
      }
    }
  }

  // water metodus
  public void water(int waterAmount) {
    int needsWater = 0;
    for (int i = 0; i < flowers.size(); i++) {
      Flower currentFlower = this.flowers.get(i);
      if (currentFlower.getWaterStatus()) {
        needsWater++;
      }
    }
    for (int i = 0; i < trees.size(); i++) {
      Tree currentTree = this.trees.get(i);
      if (currentTree.getWaterStatus()) {
        needsWater++;
      }
    }

    if (needsWater > 0) {
      waterAmount /= needsWater;
    }
    for (int i = 0; i < flowers.size(); i++) {
      Flower currentFlower = this.flowers.get(i);
      if (currentFlower.getWaterStatus()) {
        currentFlower.water(waterAmount);
      }
    }
    for (int i = 0; i < trees.size(); i++) {
      Tree currentTree = this.trees.get(i);
      if (currentTree.getWaterStatus()) {
        currentTree.water(waterAmount);
      }
    }


  }
}