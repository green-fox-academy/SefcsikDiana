package postit;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    // Create a few example post-it objects:
    //  an orange with blue text: "Idea 1"
    PostIt orange = new PostIt();
    orange.backgroundColor = Color.ORANGE;
    orange.text = "Idea 1";
    orange.textColor = Color.BLUE;
//  a pink with black text: "Awesome"
    PostIt pink = new PostIt(Color.pink,"Awesome", Color.black);
//  a yellow with green text: "Superb!"
    PostIt yellow = new PostIt(Color.yellow, "Superb!", Color.green);
  }
}
