package org.example.stream;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> AL = new ArrayList<String>();

        System.out.println("Enter names: ");
        while (true) {
            System.out.print("name = ");
            s = scanner.nextLine();
            if (s.equals("")==true)
                break;
            AL.add(s);
        }
        System.out.println();

        AL.stream().filter(e -> e.toCharArray()[0] == 'J').forEach(System.out::println);

    }

}
