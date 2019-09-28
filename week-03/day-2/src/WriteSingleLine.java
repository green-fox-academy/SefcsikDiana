import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {
  // Write a function that is able to manipulate a file
  // By writing your name into it as a single line
  // The file should be named "my-file.txt"
  // In case the program is unable to write the file,
  // It should print the following error message: "Unable to write file: my-file.txt"
  public static void main(String[] args) {
    functionManipulateFile("my-file.txt");
  }

  public static void functionManipulateFile(String name) {
    try {
      Path filePath = Paths.get(name);
      List<String> content = Files.readAllLines(filePath);
      content.add("Sefcsik Diana");
      //content.add(6,"Sefcsik Diana"); //pontosan a 6.sorba szurja be!!!!
      Files.write(filePath, content);
      for (String i : content) {
        System.out.println(i);
      }
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}