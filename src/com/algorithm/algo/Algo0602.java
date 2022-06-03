package com.algorithm.algo;

import java.util.ArrayList;

public class Algo0602 {
    public static void main(String[] args) {
        /*
        정수 배열 nums와 정수 대상이 주어지면 두 숫자의 인덱스를 반환하여 대상에 합산되도록 합니다.
        각 입력에 정확히 하나의 솔루션이 있다고 가정하고 동일한 요소를 두 번 사용하지 않을 수 있습니다.
        어떤 순서로든 답변을 반환할 수 있습니다.
        LeetCode Twosum
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        Solution solution = new Solution();
        int[] nums ={1,2,3,4};
        int target = 5;
        System.out.println(solution.twoSum(nums, target));

    }


    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i = 0 ; i<nums.length ; i++) {
                for (int j= i+1; j<nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }
}
