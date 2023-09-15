package org.example.collection;

/*
4. Методы union() и intersect()
Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих операции объединения и пересечения множеств.
Протестируйте работу этих методов на предварительно заполненных множествах.
 */

import java.util.HashSet;

public class Task4 {

    public static <T> HashSet<T> union(HashSet<T> hashSet1, HashSet<T> hashSet2) {

        HashSet<T> result = new HashSet<>();

        for (T el : hashSet1) {
            result.add(el);
        }

        for (T el : hashSet2) {
            result.add(el);
        }

        return result;
    }

    public static <T> HashSet<T> intersect(HashSet<T> hashSet1, HashSet<T> hashSet2) {

        HashSet<T> result = new HashSet<>();

        for (T el : hashSet1) {
            if (hashSet2.contains(el)) {
                result.add(el);
            }
        }


        return result;
    }
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(8);
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(7);

        HashSet<Integer> intersect = intersect(hashSet1,hashSet2);
        HashSet<Integer> union = union(hashSet1,hashSet2);

        System.out.println(intersect);
        System.out.println("_____________");
        System.out.println(union);


    }
}
