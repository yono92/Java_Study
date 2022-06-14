package com.algorithm.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo6014 {
    public static void main(String[] args) {
        System.out.println("0614 알고리즘 시작");
//        int[] arr = {5, 9, 7, 10};
//        System.out.println(Arrays.toString(solution1(arr, 5)));
//        System.out.println(solution2("a234"));
//        System.out.println(solution3(3));
//        System.out.println(solution4("AB", 1));
        System.out.println(solution5("try hello world"	));
    }

    /*
    문제 설명
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
     */
    public static int[] solution1(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        int size = 0;
        for (int n: list) {
            answer[size++] = n;
        }
        Arrays.sort(answer);
        return answer;
    }

    /*
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
     */
    public static boolean solution2(String s) {
        boolean answer = true;
        final String REGEX = "[0-9]+";
        if (s.length() == 4 || s.length() == 6) {
            if (!s.matches(REGEX)) {
                answer = false;
            }
        } else {
            answer = false;
        }
        return answer;
    }


    public static String solution3(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
    /*
    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
    "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
     */
    public static String solution4(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer += ch;
                continue;
            }
            if(ch>='a' && ch<='z') { //소문자
                if(ch+n > 'z') {
                    answer += (char)(ch-26+n);
                }else {
                    answer += (char)(ch+n);
                }
            }else if(ch>='A' && ch<='Z') { //대문자
                if(ch+n > 'Z') {
                    answer += (char)(ch-26+n);
                }else {
                    answer += (char)(ch+n);
                }
            }
        }
        return answer;
    }

    public static String solution5(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer += ' ';
                idx = 0;
                continue;
            }
            if (idx % 2 == 0) {
                idx++;
                answer += String.valueOf(Character.toUpperCase(ch));
            } else {
                idx++;
                answer += String.valueOf(Character.toLowerCase(ch));
            }
        }

        return answer;
    }
}
