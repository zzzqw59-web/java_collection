package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println("studentMap = " + studentMap);

        studentMap.put("studentA", 100);
        System.out.println("studentMap = " + studentMap);

        boolean containKey = studentMap.containsKey("studentA");
        System.out.println("containKey = " + containKey);

        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
