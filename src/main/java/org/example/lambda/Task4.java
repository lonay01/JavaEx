package org.example.lambda;

import org.example.generics.ContainsPredicate;

import java.util.function.Consumer;

class HeavyBox {
    int n;
    HeavyBox(int n) {
        this.n = n;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Consumer<HeavyBox> consumer = (HeavyBox) -> System.out.println("отгрузили ящик с весом " + HeavyBox.n);
        Consumer<HeavyBox> consumer1 = (HeavyBox) -> System.out.println("отправили ящик с весом " + HeavyBox.n);
        HeavyBox heavyBox = new HeavyBox(1);
        consumer.andThen(consumer1).accept(heavyBox);
    }
}
