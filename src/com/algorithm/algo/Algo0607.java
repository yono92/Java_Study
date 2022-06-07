package com.algorithm.algo;

import java.util.Arrays;
public class Algo0607 {
    public static void main(String[] args) {
        System.out.println("자료구조/알고리즘 공부 2022년 6월 7일 ");
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums,0));
        System.out.println(getSum(1, 2));
    }
    /*
    nums오름차순으로 정렬된 정수 배열 ( 고유한 값 포함)이 있습니다.
    함수에 전달되기 전에 결과 배열이 nums( 0- 인덱싱 됨 ) 알 수 없는 피벗 인덱스 ( )에서 회전 할 수 있습니다. 예를 들어, 피벗 인덱스에서 회전되어 가 될 수 있습니다 .k1 <= k < nums.length[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]][0,1,2,4,5,6,7]3[4,5,6,7,0,1,2]
    nums 가능한 회전 후 배열 과 정수가 주어지면 에 있으면 의 인덱스를target 반환 하고 에 없으면 의 인덱스를 반환합니다 .targetnums-1nums
    O(log n)런타임 복잡성 이 있는 알고리즘을 작성해야 합니다 .
     */
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[start] <= nums[mid]){
                if (target < nums[mid] && target >= nums[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }


    /*
    a두 개의 정수 and 가 주어지면 and 연산자를 사용하지 않고 두 정수의 합을b 반환 합니다 . + -
     */
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

