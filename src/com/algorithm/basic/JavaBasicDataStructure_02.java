package com.algorithm.basic;

import java.util.HashMap;

public class JavaBasicDataStructure_02 {
    public static void main(String[] args) {
        /*
        Map은 Key와 Value를 한 쌍으로 갖는 자료형다.
         */

        /*
        HashMap
         */
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("sports", "축구");

        System.out.println(map.get("people")); // value인 "사람" 출력

        System.out.println(map.containsKey("people")); //people라는 key가 있는지 boolean으로 출력
        System.out.println(map.containsValue("사람")); // Value가 있는지를 조회한 후 출력
        System.out.println(map.remove("people")); // "people"라는 키를 삭제 한후 출력
        System.out.println(map.size());
        System.out.println(map.keySet()); // 모든 Key값을 리턴
    }
}
