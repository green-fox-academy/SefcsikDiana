package pirates;

public class Pirate {
  public static final int ALIVE = 0;
  public static final int PASSED_OUT = 1;
  public static final int DEAD = -1;

  private int rumCounter;
  private int stateOfPirate;

  public Pirate() {
    this.rumCounter = 0;
    this.stateOfPirate = ALIVE;
  }

  public void drinkSomeRum() {
    this.rumCounter++;
  }

  public void howsItGoingMate() {
    if (this.rumCounter <= 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      this.stateOfPirate = PASSED_OUT;
    }
  }

  public int getStateOfPirate() {
    return this.stateOfPirate;
  }
}
