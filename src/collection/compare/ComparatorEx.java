package collection.compare;

import java.util.*;

public class ComparatorEx {
    static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("철수", 20));
        students.add(new Student("영희", 18));
        students.add(new Student("민수", 25));

        // Comparator로 정렬 기준 전달
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });

        for (Student student : students) {
            System.out.println(student.name + " : " + student.age);
        }

    }
}
