package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 데이터 추가
        set.add("Java");
        set.add("Spring");
        set.add("SQL");

        System.out.println("set = " + set);

        // 중복 데이터 추가
        boolean result = set.add("Java");
        System.out.println("추가 결과 = " + result);
        System.out.println(set);

        // 데이터 포함 여부
        System.out.println("Java 포함 여부 = " + set.contains("Java"));

        // 데이터 삭제
        set.remove("SQL");

        System.out.println("삭제 후 = " + set);
    }
}
