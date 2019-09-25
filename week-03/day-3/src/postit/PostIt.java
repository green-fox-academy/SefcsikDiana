package postit;
import java.awt.*;
public class PostIt {
// class Create a PostIt class that has
  Color backgroundColor;
  //      a text on it
  String text;
  //      a backgroundColor
  Color textColor;
  public PostIt (Color backgroundColor, String text, Color textColor){
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }
  public PostIt (){
  }
}
