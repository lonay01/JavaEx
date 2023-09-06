package org.example.generics.javarush;

import java.util.*;

class  extSomeClass <T extends Number> extends SomeClass<T> implements List<SomeClass> {

    public extSomeClass(T t) {
        super(t);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<SomeClass> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(SomeClass someClass) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends SomeClass<T>> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends SomeClass<T>> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends SomeClass> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends SomeClass> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public SomeClass get(int index) {
        return null;
    }

    @Override
    public SomeClass set(int index, SomeClass element) {
        return null;
    }

    @Override
    public void add(int index, SomeClass element) {

    }

    @Override
    public SomeClass remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<SomeClass> listIterator() {
        return null;
    }

    @Override
    public ListIterator<SomeClass> listIterator(int index) {
        return null;
    }

    @Override
    public List<SomeClass> subList(int fromIndex, int toIndex) {
        return null;
    }
}

public class SomeClass<T extends Number> {
    T t;

    @Override
    public String toString() {
        return "SomeClass{" +
                "t=" + t +
                '}';
    }

    public T getT() {
        return t;
    }

    public SomeClass(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        SomeClass<Integer> newSomeClassObject = new SomeClass<>(1);
        System.out.println(newSomeClassObject);

        Solution<extSomeClass<Integer>> someClassSolution= new Solution<>();
    }
}

class Solution <T extends List<SomeClass>> {
    T t;

    @Override
    public String toString() {
        return "Solution{" +
                "t=" + t +
                '}';
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Solution() {
        this.t = t;
    }
}
