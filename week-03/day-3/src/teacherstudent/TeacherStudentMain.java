package teacherstudent;

public class TeacherStudentMain {
  public static void main(String[] args) {
    Student attendee = new Student();
    Teacher t = new Teacher();

    t.teach(attendee);
    attendee.question(t);
  }
}
