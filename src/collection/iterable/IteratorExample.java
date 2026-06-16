package collection.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("spring");
        list.add("sql");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println("value = " + value);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
