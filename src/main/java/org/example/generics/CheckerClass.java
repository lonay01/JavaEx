package org.example.generics;

public class CheckerClass {
    public static <T> boolean CompareTwoArrays(T[] arr1,T[] arr2) {
        for (int i  = 0; i <  (arr1.length > arr2.length ? arr1.length : arr2.length); i ++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1,2,3};
        Integer[] arr2 = { 1,2,4};
        System.out.println(CompareTwoArrays(arr1,arr2));
    }
}
