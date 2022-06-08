package com.algorithm.algo;

import java.util.Arrays;
import java.util.Collections;

public class Algo0608 {
    public static void main(String[] args) {
//        System.out.println(solution(3,5));
//        System.out.println(solution(3,3));
//        System.out.println(solution(5,3));
//        int[][] arr1 = {{1, 2}, {2, 4}};
//        int[][] arr2 = {{3, 4}, {5, 6}};
//        System.out.println(solution3(arr1,arr2));
//        System.out.println(Arrays.toString(solution5(2,5)));
//        System.out.println(solution6("yoonsejong"));
        System.out.println(solution7(new int[]{1, 2, 3, 4}));
    }
    public static long solution(int a, int b) {
        long answer = 0;
//        if (a == b) {
//            answer = a;
//        } else if (a >= b) {
//            int c = 0;
//            c = b + 1;
//            answer = a + b + c;
//        } else if (b >= a) {
//            int c = 0;
//            c = a + 1;
//            answer = a + b + c;
//        }
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        }else{
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }

    /*
    정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
    단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
    [10]면 [-1]을 리턴 합니다.
     */
    public static int[] solution2(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        if(arr.length==1){
            return new int[]{-1};
        }
        for(int i =0; i<arr.length; i++){
            min = Math.min(arr[i],min);
        }
        answer = new int[arr.length-1];

        int j =0;
        for(int i =0; i<answer.length; i++){
            if(arr[j] == min){
                j++;
                i--;
                continue;
            }
            answer[i] = arr[j];
            j++;
        }
        return answer;
    }



    public static int[][] solution3(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println();
        }
        return answer;
    }

    public static String solution4(String phone_number) {
        String answer = "";

        // 0 1 0 7 2 2 4 7 6 2 5
        // 0 1 2 3 4 5 6 7 8 9 10
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;
    }
/*
    var answer = [];
    let add = x
    for(let i=0; i<n;i++) {
        answer.push(x);
        x += add
    }
    return answer;
 */
    public static long[] solution5(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n ; i++) {
            answer[i] = x + x*i;
        }
        return answer;
    }
    public static String solution6(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length(); i++) {
                answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
            }
        } else {
            answer = s.substring(s.length() / 2 , s.length() / 2 + 1);
        }
        return answer;
    }

    public static double solution7(int[] arr) {
        double answer = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
            avg = answer / arr.length;

        }
        return avg;
    }

    public static long solution8(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        if (result % 1 == 0) {
            answer = (long) Math.pow(result + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
    /*
    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
    예를들어 n이 118372면 873211을 리턴하면 됩니다.
     */
    public static long solution9(long n) {
        long answer = 0;
        String[] arr = ("" + n).split("");
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        answer = Long.parseLong(String.join("", arr));
        return answer;
    }

}
