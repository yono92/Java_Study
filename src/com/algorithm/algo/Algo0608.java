package com.algorithm.algo;

public class Algo0608 {
    public static void main(String[] args) {
        System.out.println(solution(3,5));
        System.out.println(solution(3,3));
        System.out.println(solution(5,3));
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
}
