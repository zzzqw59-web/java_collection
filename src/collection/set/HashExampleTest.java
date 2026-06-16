package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashExampleTest {
    static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("set = " + set);
    }
}
