package org.example.collection;
/*
8. Добавить студентов в коллекцию
Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3.
Если средний балл>=3, студент переводится на следующий курс.
Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */


import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    String group;
    int course;
    int grade;

    public Student(String name, String group, int course, int grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
public class Task8 {

    public static void delete(List<Student> list) {
        List<Student> stDelete = new ArrayList<>();
        for (Student st : list) {
            if (st.grade < 3)
                stDelete.add(st);
        }

        list.removeAll(stDelete);

        for (int i =0; i < list.size(); i++) {
            if (list.get(i).grade >= 3) {
                Student st = list.get(i);
                st.course++;
                list.remove(i);
                list.add(st);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student st : students) {
            if (st.course == course)
                System.out.println(st);
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("Masha", "B1", 1, 5);
        Student st2 = new Student("Misha", "B2", 2, 4);
        Student st3 = new Student("Sergey", "B2", 2, 5);
        Student st4 = new Student("Egor", "B1", 1, 3);
        Student st5 = new Student("Ivan", "B1", 1, 2);

        List<Student> studentList = new ArrayList<>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);



        printStudents(studentList,2);
    }
}
