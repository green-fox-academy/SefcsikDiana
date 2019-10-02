package anagram;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void anagramChecker_True() {
    Anagram anagram = new Anagram();
    Boolean result = anagram.anagramChecker("mama","amam");
    assertEquals(true,result);
  }

  @Test
  public void anagramChecker_False() {
    Anagram anagram = new Anagram();
    Boolean result = anagram.anagramChecker("apami","amam");
    assertEquals(false,result);
  }
}