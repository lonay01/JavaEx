package org.example.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*3. Набор чисел
Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.

 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        HashSet<Integer> AL = new HashSet<>();

        System.out.println("Enter names: ");
        while (true) {
            System.out.print("number = ");
            s = scanner.nextLine();
            if (s == "")
                break;
            AL.add(Integer.valueOf(s));
        }
        System.out.println();

        for (int i : AL) {
            System.out.println(i);
        }
    }
}
