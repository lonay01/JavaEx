package org.example.funThings;

import java.util.*;
import java.util.stream.Collectors;

class User implements Comparable<User>{
    String FIO;
    int year;

    @Override
    public int compareTo(User o) {
        return this.year - o.year;
    }

    @Override
    public String toString() {
        return "User{" +
                "FIO='" + FIO + '\'' +
                ", year=" + year +
                '}';
    }

    public User(String FIO, int year) {
        this.FIO = FIO;
        this.year = year;
    }
}

public class Fun1 {
    public static Map<Integer, List<User>> groupingUserList(List<User> userList) {

        Map<Integer, List<User>> result = new HashMap<>();
        Set<Integer> yearSet = new HashSet<>();



        for (User user : userList) {
            if (result.containsKey(user.year)) {
                List<User> bufferUserList = result.get(user.year);
                bufferUserList.add(user);
//                result.put(user.year, bufferUserList);
            }
            else {
                List<User> smallBuffer = new ArrayList<>();
                smallBuffer.add(user);
                result.put(user.year, smallBuffer);
            }
        }
//
//        for (Integer year : yearSet) {
//
//            List<User> bufferUserList = new ArrayList<>();
//
//            for (int i = 0; i < userList.size(); i++) {
//                if ( userList.get(i).year == year) {
//                    bufferUserList.add(userList.get(i));
//                }
//            }
//
//            result.put(year,bufferUserList);
//        }

        return result;
    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Serezha", 2001));
        userList.add(new User("Serezha1", 155));
        userList.add(new User("Serezha2", 232));
        userList.add(new User("Serezha3", 2222));
        userList.add(new User("Serezha4", 3333));
        userList.add(new User("Serezha5", 2001));

        List<User> userList1 = userList;
        System.out.println(groupingUserList(userList));
    }

}