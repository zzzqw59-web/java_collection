package collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println("set = " + set);
    }
}
