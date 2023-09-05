package org.example.task7;

import org.w3c.dom.html.HTMLHeadElement;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Product {
    private int price;
    private int art;

    public Product(int price, int art) {
        this.price = price;
        this.art = art;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", art=" + art +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        HashMap<String,Product> productHashMap = new HashMap<>();
        Product product1 = new Product(100,1);
        Product product2 = new Product(17700,2);
        Product product3 = new Product(600,3);
        Product product4 = new Product(500,4);
        Product product5 = new Product(1003,5);

        productHashMap.put("Sharik", product1);
        productHashMap.put("Myachik", product2);
        productHashMap.put("Piramidka", product3);
        productHashMap.put("Domik", product4);
        productHashMap.put("Mashina", product5);

        for ( Map.Entry entry: productHashMap.entrySet()) {
            System.out.println(entry);
        }

        for ( String key: productHashMap.keySet()) {
            System.out.println(key);
        }

        for ( Product pr: productHashMap.values()) {
            System.out.println(pr);
        }

    }
}
