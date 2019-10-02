package sum;

import java.util.ArrayList;

public class Sum {

  public Integer sum(ArrayList<Integer> listToSum) {
    Integer sum = 0;
    if (listToSum == null) {
      return null;
    } else {
      for (int i = 0; i < listToSum.size(); i++) {
        sum += listToSum.get(i);
      }
      return sum;
    }
  }
}
