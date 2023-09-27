package Lesson22.Homework;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;}
    public void setName(StringBuilder name) {
        if (name.length() >= 3){this.name = name;}}
    public int getCourse() {return course;}
    public void setCourse(int course) {
        if (course >= 1 && course <=4){this.course = course;}}
    public double getGrade(){return grade;}
    public void setGrade(double grade){
        if (grade >+ 1 && grade <=10){this.grade = grade;}}
    public static void showInfo(Student st){
        System.out.println("Name of student: " + st.getName());
        System.out.println("Course of student " + st.getName() + ": " + st.getCourse());
        System.out.println("Grade of student " + st.getName() + ": " + st.getGrade());
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Johanson"));
        st.setCourse(3);
        st.setGrade(8.5);
        Student.showInfo(st);
    }
}