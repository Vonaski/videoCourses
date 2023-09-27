package Generics;

public class TypeErasure {
    public static void main(String[] args) {

    }
//    public void abc(Inf<String> inf){
//        String s = inf.getValue();
//    }
//    public void abc(Inf<Integer> inf){
//        Integer i = inf.getValue();
//    }
}
class Inf<T> {
    private T value;
    public Inf(T value) {
        this.value = value;
    }
    public String toString() {
        return "{ [" + value + "] }";
    }
    public T getValue() {
        return value;
    }
}
class Parent {
        public void abc(Inf<String> inf){
        String s = inf.getValue();
    }
}
class Child extends Parent {
//    public void abc(Inf<Integer> inf){
//        Integer i = inf.getValue();
//    }
}

