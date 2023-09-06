package org.example.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapPrint {

    public static <T,V> void prtintMap(Map<T,V> tvMapp) {
        Set<T> keys = tvMapp.keySet();
        for (T key: keys) {
            System.out.println(key + " - " + tvMapp.get(key));
        }
    }

    public static void main(String[] args) {

        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"11");
        integerStringMap.put(2,"22");

        prtintMap(integerStringMap);
    }
}
