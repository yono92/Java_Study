package com.algorithm.algo;

public class Algo0608 {
    public static void main(String[] args) {
//        System.out.println(solution(3,5));
//        System.out.println(solution(3,3));
//        System.out.println(solution(5,3));
        int[][] arr1 = {{1, 2}, {2, 4}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(solution3(arr1,arr2));
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
}
