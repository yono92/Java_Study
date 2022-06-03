package com.algorithm.basic;


import java.util.*;

public class DataStructurePrac {
    public static void main(String[] args) {
        /*
        홍길동 씨의 과목별 점수는 다음과 같다. 홍길동 씨의 평균 점수를 구해 보자.
        과목	점수
        국어	80
        영어	75
        수학	55
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(80);
        arrayList.add(75);
        arrayList.add(55);
        int n = 0;
        System.out.println(arrayList);
        for (int i =0; i<arrayList.size(); i++) {
            n += arrayList.get(i);
            int mean = n / 3;
            System.out.println(n);
            System.out.println(mean);
        }

        /*
        자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해 말해 보자.
         */
        int num1 = 13;
        if(num1 % 2 ==1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }

        /*
        홍길동 씨의 주민등록번호는 881120-1068234이다. 홍길동 씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.
         */

        String juminnum = "881120-1069234";
        System.out.println(juminnum);
        String before = juminnum.substring(0, 6);
        System.out.println(before);
        String YYYY = juminnum.substring(0, 2);
        System.out.println("YYYY = "+YYYY);
        String MM = juminnum.substring(2, 4);
        System.out.println("MM = "+MM);
        String DD = juminnum.substring(4, 6);
        System.out.println("DD = "+DD);
        String after = juminnum.substring(7, 14);
        System.out.println(after);

        /*
        다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.
         */

        String a = "a:b:c:d";
        System.out.println(a.replace(":",","));


        /*
        다음과 같은 [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들어 보자.
         */
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        /*
        다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력해 보자.
         */

        ArrayList<String> mylist2 = new ArrayList<>((Arrays.asList("Life", "is", "too", "short")));
        String result1 = String.join(",", mylist2);
        System.out.println(result1);


        /*
        다음의 맵 grade에서 "B'에 해당되는 값을 추출해 보자. (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.)
         */
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        grade.remove("B");


        /*
        다음의 numbers 리스트에서 중복 숫자를 제거해 보자.
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> set = new HashSet<>(numbers);
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
        System.out.println(set);
    }
}
