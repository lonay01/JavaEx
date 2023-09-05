package org.example.task7;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubarraysWithElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        List<SubarraySum> sums = getAllSubarraySums(array);

        System.out.println("Суммы всех подмассивов и элементы, которые были просуммированы:");
        for (SubarraySum sum : sums) {
            System.out.println("Сумма: " + sum.sum);
            System.out.println("Элементы: " + sum.elements);
        }
    }
    static class SubarraySum {
        int sum;
        List<Integer> elements;

        public SubarraySum(int sum, List<Integer> elements) {
            this.sum = sum;
            this.elements = elements;
        }
    }

    public static List<SubarraySum> getAllSubarraySums(int[] array) {
        List<SubarraySum> sums = new ArrayList<>();
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentSum = 0;
                List<Integer> elements = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    currentSum += array[k];
                    elements.add(array[k]);
                }
                sums.add(new SubarraySum(currentSum, elements));
            }
        }

        return sums;
    }


}