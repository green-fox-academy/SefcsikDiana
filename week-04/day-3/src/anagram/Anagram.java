package anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
  public boolean anagramChecker(String word1, String word2){
    boolean anagramm = false;
    if (word1.length() != word2.length()){
     // System.out.println("They cannot be an Anagramms.");
     return anagramm;
    } else {
      char[]Array1= word1.toCharArray();
      char[]Array2 = word2.toCharArray();
      Arrays.sort(Array1);
      Arrays.sort(Array2);

        int counter = 0;
      for (int i = 0; i < Array1.length; i++) {
        if (Array1[i] == Array2[i]) {
          counter += 1;
          // System.out.println("They are Anagramms.");
        }
      }
      if (counter == Array1.length){
        anagramm = true;
      }
      return anagramm;
    }
  }
}
