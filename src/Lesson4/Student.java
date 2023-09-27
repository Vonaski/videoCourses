package Lesson4;

public class Student {
    String name;
    int ID;
    int Year;
    double Mat;
    double Ec;
    double Lang;

}

class StudentTest {
    double SredArfm(Student st) {
        double sredOcenka = (st.Ec + st.Lang + st.Mat) / 3;
        System.out.println("Средняя оценка " + st.name + st.ID + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {
        Student St1 = new Student();

        St1.name = "Alexey";
        St1.ID = 1;
        St1.Year = 3;
        St1.Mat = 9;
        St1.Ec = 7.5;
        St1.Lang = 8.5;

        StudentTest sTest = new StudentTest();
        sTest.SredArfm(St1);


    }
}
