package com.algorithm.algo;

public class Algo0603 {
    public static void main(String[] args) {
        /*
        당일 주어진 주식의 가격이 인 배열이 제공 prices됩니다 .prices[i]ith
        한 주식을 매수할 날 을 선택 하고 해당 주식을 매도할 다른 날을 미래 에 선택하여 이익을 최대화하려고 합니다 .
        이 거래에서 얻을 수 있는 최대 이익을 반환 합니다 . 이익을 얻을 수 없으면 를 반환 0하십시오.
         */
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int benefit = 0;
        int pist = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if (benefit < pist) {
                benefit = pist;
            }
        }
        return benefit;
    }
}
