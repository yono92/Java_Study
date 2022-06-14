package com.algorithm.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo6014 {
    public static void main(String[] args) {
        System.out.println("0614 알고리즘 시작");
        int[] arr = {5, 9, 7, 10};
        System.out.println(Arrays.toString(solution1(arr, 5)));
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



}
