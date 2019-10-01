package cloneable;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class Student extends Person {
  String previousOrganization;
  int skipDays;

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
  }

  public Student(String newName, int newAge, String newGender, String previousOrganization) {
    super(newName, newAge, newGender);
    this.previousOrganization = previousOrganization;
  }

  @Override
  public void getGoal() {
    //super.getGoal();
    System.out.println("My goal is: Be a junior software developer.");
  }

  @Override
  public void introduce() {
    // super.introduce();
    System.out.println("HI, I'am " + this.name + ", a " + this.age + " year old " + this.gender + " from " + this.previousOrganization + " who skipped " + this.skipDays + " day from the course already.");
  }

  public void skipDays(int numberofDays) {
    this.skipDays += numberofDays;
  }

  @Override
  public Student clone() {
    Student student = new Student(name, age, gender, previousOrganization);
    return student;

  }
}
//  public static void main(String[] args) {
//    Student student = new Student();
//
//    student.introduce();
//    student.getGoal();
//  }

