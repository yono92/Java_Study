package com.algorithm.basic;

import java.util.Arrays;
import java.util.HashSet;

public class JavaBasicDataStructure_03 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H","E","L","L","O"));
        System.out.println(set);

        /*
        Set 자료형
            - 중복을 허용하지 않는다.
            - 순서가 없다.
         */

        // 교집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2); // 교집합 수행
        System.out.println(intersection);

        // 합집합
        HashSet<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> s4 = new HashSet<>(Arrays.asList(4, 5, 6));

        HashSet<Integer> union = new HashSet<>(s3);
        union.addAll(s4);
        System.out.println(union);

        //차집합
        HashSet<Integer> s5 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> s6 = new HashSet<>(Arrays.asList(3));

        HashSet<Integer> substract = new HashSet<>(s5);
        substract.removeAll(s6);
        System.out.println(substract);


        /*
        집합 자료형 관련 메소드
         */
        // 값 추가하기
        HashSet<String> setset = new HashSet<>();
        setset.add("Algo");
        setset.add("Study");
        setset.add("Start");
        System.out.println(setset); // 순서가 상관 없이 나온것을 확인할수 있다.  [Study, Start, Algo]

        // 값 여러개 추가하기
        HashSet<String> set2 = new HashSet<>();
        set2.add("I");
        set2.addAll(Arrays.asList("Brick", "s"));
        System.out.println(set2);

        // 특정 값 제거하기
        HashSet<String> set3 = new HashSet<>(Arrays.asList("I", "Brick"));
        set3.remove("I");
        System.out.println(set3);


        /*
        TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다.
        LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.
         */
    }
}
