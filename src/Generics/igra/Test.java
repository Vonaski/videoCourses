package Generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar sch1 = new Schoolar("Ivan", 13);
        Schoolar sch2 = new Schoolar("Mariya", 15);

        Student st1 = new Student("Nikolay", 20);
        Student st2 = new Student("Kseniya", 18);

        Employee emp1 = new Employee("Zaur", 32);
        Employee emp2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolTeam = new Team<>("NaVi");
        Team<Schoolar> schoolTeam2 = new Team<>("Spirit");
        schoolTeam.addNewPart(sch1);
        schoolTeam.addNewPart(sch2);
        schoolTeam2.addNewPart(sch1);
        schoolTeam2.addNewPart(sch2);

        Team<Student> studentTeam = new Team<>("OG");
        Team<Student> studentTeam2 = new Team<>("EG");
        studentTeam.addNewPart(st1);
        studentTeam.addNewPart(st2);
        studentTeam2.addNewPart(st1);
        studentTeam2.addNewPart(st2);

        Team<Employee> employeeTeam = new Team<>("Liquid");
        Team<Employee> employeeTeam2 = new Team<>("FazeClan");
        employeeTeam.addNewPart(emp1);
        employeeTeam.addNewPart(emp2);
        employeeTeam2.addNewPart(emp1);
        employeeTeam2.addNewPart(emp2);

        schoolTeam.playWith(schoolTeam2);
        studentTeam.playWith(studentTeam2);
    }
}
