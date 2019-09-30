package greenfoxorganization;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String newName, int newAge, String newGender, String company) {
    super(newName, newAge, newGender);
    this.company = company;
  }
  public Sponsor(){

  }

  public void hire(){
    this.hiredStudents += 1;
  }

  @Override
  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }
 @Override
 public void introduce (){
   System.out.println("Hi, I'm" + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");

 }
}
