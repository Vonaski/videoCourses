package Collection.Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new java.util.HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        map1.putIfAbsent(1000, "Oleg Ivanov");
        System.out.println(map1);
        System.out.println(map1.get(3568));
        map1.remove(15879);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(6578));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
