package animal;

public class MainAnimal {
  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.drink();
    System.out.println(dog.thirst);
    Animal cat = new Animal();
    cat.play();
    System.out.println(cat.thirst);
    System.out.println(cat.hunger);
    Animal monkey = new Animal();
    monkey.eat();
    System.out.println( monkey.hunger);
  }
}
