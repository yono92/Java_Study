package com.algorithm.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algo0609 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution2(3,12)));
        System.out.println(solution4("...!@BaT#*..y.abcdefghijklm"));
    }


    /*
    배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
    예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
    array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    2에서 나온 배열의 3번째 숫자는 5입니다.
    배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
    commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
     */
    public static int[] solution1(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
        }
        return answer;
    }
    /*
    두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
    배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
    예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
     */
    public static int[] solution2(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);

        answer[0] = gcd(max, min);
        answer[1] = max * min / answer[0];

        return answer;

    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse == x;
    }

    public static int solution3(String s) {
        int answer = 0;
        s = s.replace("zero", "0");
        s = s.replace("one", "1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");
        answer = Integer.valueOf(s);
        return answer;
    }


    //카카오 블라인드 채용 신규유저 아이디 추천
    public static String solution4(String new_id) {
        String answer = new_id;

        answer = answer.toLowerCase() // 1
                .replaceAll("[^a-z0-9-_.]", "") // 2
                .replaceAll("[.]{2,}", ".") // 3
                .replaceAll("^[.]|[.]$", ""); // 4
        answer = answer.equals("") ? "a" : answer; // 5
        answer = answer.length() > 15 ? answer.substring(0, 15).replaceAll("[.]$", "") : answer; // 6
        while (answer.length() <= 2) {
            answer += answer.substring(answer.length()-1); // 7
        }

        return answer;

    }
}
