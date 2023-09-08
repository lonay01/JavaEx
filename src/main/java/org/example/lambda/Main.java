package org.example.lambda;


interface FunctionalInterface {
    public int sum (int a, int b);
}

public class Main {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = (a,b) -> a+b;
        System.out.println(functionalInterface.sum(1, 2));
    }
}
