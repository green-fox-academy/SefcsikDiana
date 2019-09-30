package greenfoxorganization;

public class Mentor extends Person{
  String level; // junior/intermediate/senior

  public Mentor(String newName, int newAge, String newGender, String level) {
    super(newName, newAge, newGender);
    this.level = level;
  }

  public Mentor(){
    super();
    this.level = "intermediate";
  }
  @Override
  public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + name + ", a " +  age  + " year old " + " " + gender + " "+ level + " " + "mentor.");
  }
//
//  public static void main(String[] args) {
//    Mentor mentor = new Mentor();
//    mentor.getGoal();
//    mentor.introduce();
//  }
}