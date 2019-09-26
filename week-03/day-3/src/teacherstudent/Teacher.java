package teacherstudent;

public class Teacher {
//  Teacher class

//  teach(student) -> calls the students learn method
  public void teach(Student student){
    System.out.println(student.learn());
  }
  //  answer() -> prints the teacher is answering a question
  public String answer(){
    return "prints the teacher is answering a question";
  }
}
