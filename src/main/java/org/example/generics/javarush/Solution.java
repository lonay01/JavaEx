package org.example.generics.javarush;

import java.util.HashMap;
import java.util.Map;


     public class Solution <T extends Map> {
        T map;

        public Solution( T map ) {
            this.map = map;
        }
        public T getMap() {
            return map;
        }


    public static void main(String[] args) {
        HashMap<String,Integer> integerHashMap = new HashMap<>();


        Solution solution = new Solution(integerHashMap);
        System.out.println(solution.getMap());

    }
}


