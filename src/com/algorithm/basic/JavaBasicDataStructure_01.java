package com.algorithm.basic;

import java.util.ArrayList;
import java.util.Comparator;

public class JavaBasicDataStructure_01 {
    public static void main(String[] args) {
        //배열
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "수", "금"};
        for (int i =0; i< weeks.length; i++) {
            System.out.print(weeks[i]);
        }
        // ArrayIndexOutOfBoundsException 일반적으로 배열의 길이와 다른 값을 찾으려 할때 나는 오류이다.

        // List
        // ※ ArrayList를 사용하기 위해서는 import java.util.ArrayList와 같이 ArrayList를 먼저 import해야 한다.

        // List element 추가
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("158");
        pitches.add("148");

        // Index 에 element추가
        pitches.add(1,"155");


        /*
        제네릭스
        ArrayList<String pitches = new ArrayList<>(); 처럼 깩체를 포함하는 자료형도 어떤 객체를 포함하는지에 대해서 명확하게 표현할 것을
         권고하고있다.
         */
        // List 조회
        System.out.println(pitches.get(1)); // 1번에 해당하는 인덱스의 element를 조회
        // List size 조회
        System.out.println(pitches.size());
        // List contains 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.
        System.out.println(pitches.contains("148"));
        // remove
        /*
            remove(객체) remove(인덱스)
         */
        System.out.println(pitches.remove(1)); // 삭제한 결과를 true , false 로 리턴한다.
        System.out.println("ArrayList Object Remove");
        System.out.println(pitches.remove("148"));  // 삭제된 항목을 리턴한다.

        System.out.println(pitches);

        pitches.sort(Comparator.naturalOrder()); //오름차순 정렬


    }
}
