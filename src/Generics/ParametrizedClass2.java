package Generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Hello", 20);
        System.out.println("Value 1: " + p1.getValue1());
        System.out.println("Value 2: " + p1.getValue2());
        System.out.println("-------------------------------------");

        Pair<Integer, Double> p2 = new Pair<>(156, 3.14);
        System.out.println("Value 1: " + p2.getValue1());
        System.out.println("Value 2: " + p2.getValue2());
        System.out.println("-------------------------------------");

        OtherPair<String> op = new OtherPair<>("Cucumber", "Jan");
        System.out.println("Value 1: " + op.getValue1());
        System.out.println("Value 2: " + op.getValue2());

    }
}

class Pair <V1, V2> {
    private V1 value1;
    private V2 value2;
    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getValue1() {
        return value1;
    }
    public V2 getValue2() {
        return value2;
    }
}

class OtherPair <V> {
    private V value1;
    private V value2;
    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}
