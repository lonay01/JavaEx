package org.example.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Создайте класс Pet и его наследников Cat, Dog, Parrot.
Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
 */
class Pet {}
class Dog extends Pet {}
class Cat extends Pet {}
class Parrot extends Pet {}
public class Task9 {
    public static void main(String[] args) {
        Map<String,Pet> petList = new HashMap<>();

        petList.put("Murka", new Cat());
        petList.put("Bob", new Dog());
        petList.put("Parrot", new Parrot());

        for (Pet pet : petList.values()) {
            System.out.println(pet.getClass());
        }
    }
}
