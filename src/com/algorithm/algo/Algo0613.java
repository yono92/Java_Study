package com.algorithm.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algo0613 {
    public static void main(String[] args) {
        System.out.println("6월 2주차 알고리즘 시작");
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));

    }

    /*
    배열 arr가 주어집니다.
    배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
    이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
    단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
     */
    public static int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                list.add(arr[i]);
            } else if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

