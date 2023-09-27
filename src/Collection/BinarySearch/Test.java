package Collection.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(150);
        list.add(-30);
        list.add(19);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

//        int index1 = Collections.binarySearch(list, 12);
//        System.out.println(index1);

//        Employee3 emp1 = new Employee3(100, "Zaur", 12345);
//        Employee3 emp2 = new Employee3(15, "Ivan", 6542);
//        Employee3 emp3 = new Employee3(123, "Petr", 8542);
//        Employee3 emp4 = new Employee3(15, "Mariya", 5678);
//        Employee3 emp5 = new Employee3(182, "Kolya", 125);
//        Employee3 emp6 = new Employee3(15, "Sasha", 9874);
//        Employee3 emp7 = new Employee3(250, "Elena", 1579);
//        List<Employee3> emplist = new ArrayList<>();
//        emplist.add(emp1);
//        emplist.add(emp2);
//        emplist.add(emp3);
//        emplist.add(emp4);
//        emplist.add(emp5);
//        emplist.add(emp6);
//        emplist.add(emp7);
//        Collections.sort(emplist);
//        System.out.println(emplist);
//        int index2 = Collections.binarySearch(emplist, new Employee3(182, "Kolya", 125));
//        System.out.println(index2);
//
//        int[] array = {-3, 8 ,12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array, 150);
//        System.out.println(index3);
    }
}
class Employee3 implements Comparable<Employee3> {
    int id;
    String name;
    int salary;
    public Employee3(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee3 o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
