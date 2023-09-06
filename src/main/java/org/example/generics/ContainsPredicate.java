package org.example.generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class ContainsPredicate {

    public static <T> ArrayList<T> containThisObject(ArrayList<T> arrayList, T predicate) {

        ListIterator<T> listIterator = arrayList.listIterator();
        ArrayList<T> result = new ArrayList<>();

        while (listIterator.hasNext()) {
            T tmp = listIterator.next();
            if (tmp == predicate) {
                result.add(tmp);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);

        System.out.println(containThisObject(arr,2));
    }
}
