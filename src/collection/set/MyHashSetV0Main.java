package collection.set;

public class MyHashSetV0Main {
    static void main(String[] args) {
        MyHashSetV0 myHashSetV0 = new MyHashSetV0();
        myHashSetV0.add(1);
        myHashSetV0.add(2);
        myHashSetV0.add(3);
        myHashSetV0.add(4);
        System.out.println(myHashSetV0);

        boolean result = myHashSetV0.add(4);
        System.out.println("중복 데이터 저장: " + result);
        System.out.println(myHashSetV0);

        System.out.println(myHashSetV0.contains(3));
        System.out.println(myHashSetV0.contains(99));

    }
}
