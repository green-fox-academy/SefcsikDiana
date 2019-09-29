public class Color {
  // - Create a two dimensional array
  //   which can contain the different shades of specified colors
  // - In `colors[0]` store the shades of green:
  //   `"lime", "forest green", "olive", "pale green", "spring green"`
  // - In `colors[1]` store the shades of red:
  //   `"orange red", "red", "tomato"`
  // - In `colors[2]` store the shades of pink:
  //   `"orchid", "violet", "pink", "hot pink"`
  public static void main(String[] args) {
    String color[][] = {
      // color[0] row
        {"lime", "forest green", "olive", "pale green", "spring green"},
        // color[1] row
        {"orange red", "red", "tomato"},
        // color [2] row
        {"orchid", "violet", "pink", "hot pink"}
    };
    //                    row, column
    System.out.println(color[0][4]);
  }
}
