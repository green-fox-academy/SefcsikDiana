package sum;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {
  Sum sum = new Sum();

  @Test
  public void sumFunction_ForMultipleElement() {
    ArrayList<Integer>test= new ArrayList<>(Arrays.asList (3,10,20));
    int result = sum.sum(test);
    assertEquals(33,result);
  }

  @Test
  public void sumFunction_ForEmptyList() {
    ArrayList<Integer>test= new ArrayList<>();
    int result = sum.sum(test);
    assertEquals(0,result);
  }

  @Test
  public void sumFunction_ForOneElement() {
    ArrayList<Integer>test= new ArrayList<>(Arrays.asList (30));
    int result = sum.sum(test);
    assertEquals(30,result);
  }
  @Test
  public void sumFunction_ForNullList() {
    ArrayList<Integer>test= new ArrayList<>();
    Integer result = null;
    assertEquals(null,result);
  }
}


