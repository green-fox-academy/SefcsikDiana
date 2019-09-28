import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
  // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and should not raise any error.
  public static void main(String[] args) {
    functionFileName("my-file.txt");
  }

  public static void functionFileName(String name) {
    try {
      Path filePath = Paths.get(name);
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.size());
    } catch (Exception e) {
      System.out.println("zero");
    }
  }
}