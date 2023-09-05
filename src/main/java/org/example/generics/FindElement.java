package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindElement {
    public static <T> int FinderTheTargetInList(List<T> list, T target) {
        return list.indexOf(target);
    }

    public static void main(String[] args) {
        Integer[] o = new Integer[]{1, 2, 3, 4,23,23,23,23,23123,123,23,23};
        List<Integer> list = Arrays.asList(o);
        System.out.println(FinderTheTargetInList(list, 23 ));
    }
}
