package org.example.generics.javarush.task81;

import org.example.generics.javarush.task62.InterfaceForGenerics;

public class Calculator <T extends Integer> {
     public static <T extends Number> T add(T a, T b) //сложить
    {

        return a;
    }

    public static void main(String[] args) {
        add(1,2);
    }
}
