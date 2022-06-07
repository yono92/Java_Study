package com.algorithm.algo;

import java.util.*;

public class Algo0603 {
    public static void main(String[] args) {
        /*
        당일 주어진 주식의 가격이 인 배열이 제공 prices됩니다 .prices[i]ith
        한 주식을 매수할 날 을 선택 하고 해당 주식을 매도할 다른 날을 미래 에 선택하여 이익을 최대화하려고 합니다 .
        이 거래에서 얻을 수 있는 최대 이익을 반환 합니다 . 이익을 얻을 수 없으면 를 반환 0하십시오.
         */
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
        System.out.println(productExceptSelf(nums));
        int[] nums2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
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


    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<nums.length;i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }



    /*
    정수 배열이 주어지면 예외 의 모든 요소의 곱과 같은 배열nums 을 반환 합니다 . answer answer[i] nums nums[i]
    접두사 또는 접미사의 곱은 32비트 정수 에 맞도록 nums보장 됩니다 .
    O(n) 나눗셈 연산을 사용하지 않고 시간 에 따라 실행되는 알고리즘을 작성해야 합니다  .
     */

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i=0 ,tmp =1 ;i<nums.length;i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= -0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }


    /*
    정수 배열이 주어지면 nums가장 큰 합을 갖는 연속적인 하위 배열(최소한 하나의 숫자 포함)을 찾아 합을 반환 합니다 .
    하위 배열 은 배열의 연속 적인 부분입니다.
    */
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i =0 ; i<n ; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
