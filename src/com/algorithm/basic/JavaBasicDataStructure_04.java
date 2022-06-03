package com.algorithm.basic;

public class JavaBasicDataStructure_04 {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);

        int n1 =123;
        double d1 = n1;
        System.out.println(d1);

        double d2 = 123.456;
        int n2 = (int) d2;
        System.out.println(n2);

        // 실수 형태의 문자열을 정수로 변경하려고 한다면 NumberFormatException 에러가 발생한다.


        // final 자바의 final은 자료형에 값을 단 한번만 설정할수 있게 강제하는 키워드이다. 값을 재설정할수없다
        final  int n3= 123;
        System.out.println("연습문제 풀이");
    }
}
