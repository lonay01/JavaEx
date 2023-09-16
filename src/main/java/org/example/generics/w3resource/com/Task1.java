package org.example.generics.w3resource.com;
/*
 Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.
 */

public class Task1 {

    public static <T> boolean checker (T[] array1, T[] array2) {
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Integer[] arr1 = {1,2,3,4,5,6};

        System.out.println(checker(arr,arr1));
    }
}
