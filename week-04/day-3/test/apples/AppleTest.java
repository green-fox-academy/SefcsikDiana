package apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void getApple() {
  Apple myObject = new Apple();
  assertEquals("apple",myObject.getApple());
  }

  @Test
  public void getApple_FalesReturnValue() {
    Apple myObject = new Apple();
    assertEquals("pearl", myObject.getApple());
  }
}