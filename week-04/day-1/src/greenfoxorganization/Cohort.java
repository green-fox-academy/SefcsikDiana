package greenfoxorganization;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Cohort {
  String name;
  List<Student>students;
  List<Mentor>mentors;

  public Cohort(String name){
    this.name = name;
    this.students = new ArrayList<>();
    this.mentors  = new ArrayList<>();

  }
  public void addStudent(Student students){
    this.students.add(students);
  }

  public void addMentor(Mentor mentors){
    this.mentors.add(mentors);
  }

  public void info(){
    System.out.println("The" + name + " cohort has " + students.size() + " students and " + mentors.size() +  " mentors.");
  }
}
