package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;
    static void main(String[] args) {
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));
    }

    private static void add(Integer[] inputArrays, int value) {
        int hashIndex = hashIndex(value);
        inputArrays[hashIndex] = value;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
