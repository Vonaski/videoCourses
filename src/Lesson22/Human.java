package Lesson22;

public class Human {
    final String gender;

    Human(String gender) {
        this.gender = gender;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Human h = new Human("Male");
        h.setName("Pitr");
        h.setWeight(65);
        h.setAge(18);
        System.out.println("My name is " + h.getName() + " i'm " + h.getAge() + " my weight is " + h.getWeight() +"kg");
    }
}