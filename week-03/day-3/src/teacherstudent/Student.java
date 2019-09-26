package teacherstudent;

public class Student {
  //  Student class

  //  learn() -> prints the student is learning something new
  public String learn() {
    return "Student is learning something new";
  }

  public void question(Teacher teacher) {
    //  question(teacher) -> calls the teachers answer method
    System.out.println(teacher.answer());
  }
}
