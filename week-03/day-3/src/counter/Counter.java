package counter;

public class Counter {
  int value = 0;
  int store;

  public Counter() {

  }

  public Counter(int value) {
    this.value = value;
    this.store = value;
  }

  public void add(int number){
    this.value += number;
  }
  public void add() {
    this.value += 1;
  }

  public int get() {
    return this.value;
  }

  public void reset() {
    this.value = this.store;
  }

}
