package greenfoxorganization;

public class Person {
 String name;
 int age;
 String gender;

 public Person (String newName, int newAge, String newGender){
   this.name = newName;
   this.age = newAge;
   this.gender = newGender;
 }
 public Person (){
   this.name = "Jane Doe";
   this.age = 30;
   this.gender = "female";
 }

 public void introduce(){
   System.out.println("HI, I'am " + this.name + ", a " + this.age + " year old " + this.gender + ".");
 }
 public void getGoal(){
   System.out.println("My goal is: Live for the moment!");
 }
//  public static void main(String[] args) {
//    Person johny = new Person("Johny", 32, "male");
////    jonhy.name = "Jonhy";
////    jonhy.age = 32;
////    jonhy.gender = "male";
//    johny.introduce();
//    johny.getGoal();
//
//    System.out.println();
//
//    Person defaultPerson = new Person();
//    defaultPerson.introduce();
//    defaultPerson.getGoal();
//    }
  }

