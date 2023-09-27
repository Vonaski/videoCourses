package Lesson13;

public class Test1 {
}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(1);
      switch (st1.grade){
          case 2:
              System.out.println("Студент двоешник!");
              break;
          case 3:
              System.out.println("Студент троешник!");
              break;
          case 4:
              System.out.println("Студент хорошист!");
              break;
          case 5:
              System.out.println("Студент отличник!");
              break;
          default:
              System.out.println("Оценка неверна!");
      }
    }
}