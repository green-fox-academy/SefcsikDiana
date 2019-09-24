import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  // Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.
  public static void main(String[] args) {
    String street = "multiLines.txt";
    String word = "apple";
    int number = 6;
    functionParameters(street, word, number);
  }

  public static void functionParameters(String road, String letters, int lines) {
    try {
      Path filePath = Paths.get(road);   //String street, String word, int number
      List<String> rows = new ArrayList<>();
      for (int i = 0; i < lines; i++) { // lines is szamertek = int number= 6
        rows.add(letters);
      }
      Files.write(filePath, rows);
      System.out.println(rows);
    } catch (IOException e) {
      System.out.println("Nem mukodik a try!");
    }
  }
}