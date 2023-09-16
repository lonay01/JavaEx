package org.example.collection;

/*
7. Создать HashMap
Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
Перебрать и распечатать пары значений - entrySet().
Перебрать и распечатать набор из имен продуктов  - keySet().
Перебрать и распечатать значения продуктов - values().
Для каждого перебора создать свой метод.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Product {

}


public class Task7 {
    public static void main(String[] args) {
        Product pr1 = new Product();
        Product pr2 = new Product();
        Product pr3 = new Product();
        Product pr4 = new Product();
        Product pr5 = new Product();
        Product pr6 = new Product();
        Product pr7 = new Product();

        Map<String,Product> productMap = new HashMap<>();

        productMap.put("yula",pr1);
        productMap.put("yula1",pr2);
        productMap.put("yula2",pr3);
        productMap.put("yula3",pr4);
        productMap.put("yula4",pr5);
        productMap.put("yula5",pr6);
        productMap.put("yula6",pr7);

        for (Map.Entry<String,Product> map : productMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

        for (String st : productMap.keySet()) {
            System.out.println(productMap.get(st));
        }

        for (Product st : productMap.values()) {
            System.out.println((st));
        }
    }
}
