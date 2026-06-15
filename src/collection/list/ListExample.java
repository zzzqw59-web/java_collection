package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println("arrayList = " + arrayList);
        System.out.println("ArrayList 1번 조회: " + arrayList.get(1));
        arrayList.remove(1);
        System.out.println("arrayList = " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("linkedList = " + linkedList);
        System.out.println("LinkedList 1번 조회: " + linkedList.get(1));
        linkedList.remove(1);
        System.out.println("linkedList = " + linkedList);
    }
}
