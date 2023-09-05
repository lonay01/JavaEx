package org.example.generics;

import java.io.Serializable;
import java.util.Comparator;

public class  ClassWithThreeGen <T extends Comparable,V extends Animal & Serializable,K extends Number> {
    T t;
    V v;
    K k;

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public ClassWithThreeGen(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void NameOfTypes() {
        System.out.println(t.getClass() + " " + v.getClass() + " " + k.getClass());
    }

    public static void main(String[] args)  {
        ClassWithThreeGen<String, Dog, Integer> stringDogIntegerClassWithThreeGen = new ClassWithThreeGen<>("Dog1", new Dog(),11);

        System.out.println(stringDogIntegerClassWithThreeGen.getK());
        stringDogIntegerClassWithThreeGen.NameOfTypes();
    }
}
