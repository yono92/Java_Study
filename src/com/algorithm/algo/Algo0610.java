package com.algorithm.algo;

public class Algo0610 {
    public static void main(String[] args) {
        System.out.println(solution3(3, 20, 4));

    }

    /*
    문제 설명
    0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
    numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
     */
    public static int solution1(int[] numbers) {
        int answer = 45;
        for (int n: numbers) {
            answer -= n;
        }
//        int answer=0;
//        for(int i=0;i<10;i++){
//            if(!contains(numbers,i)){
//                answer+=i;
//            }
//        }
        return answer;
    }

    public static int solution2(int[][] sizes) {
        int max_w =0;
        int max_h =0;

        for (int i = 0; i < sizes.length; i++) {
            int temp;
            for (int j = 0; j < 2; j++) {
                if (sizes[i][0] < sizes[i][1]) {
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] =temp;
                }
                if (max_w < sizes[i][0]) {
                    max_w = sizes[i][0];
                }
                if (max_h < sizes[i][1]) {
                    max_h = sizes[i][1];
                }

            }
        }
        return max_h*max_w;
    }
    /*
    새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
    이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
    즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
    놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
    단, 금액이 부족하지 않으면 0을 return 하세요.
     */
    public static long solution3(int price, int money, int count) {
        long answer = 0;
        int i = 0;
//        for (int i = 0; i <=count ; i++) {
//            answer += price * i;
//            System.out.println("놀이기구를" + i +"번 타려고합니다.");
//        }
        while ( i <= count){
            System.out.println("놀이기구를" + i +"번 타려고합니다.");
            answer += price*i;
            i++;
        }
        return answer - money < 0 ? 0 : answer - money ;
    }
}
