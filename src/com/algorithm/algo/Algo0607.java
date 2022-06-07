package com.algorithm.algo;

public class Algo0607 {
    public static void main(String[] args) {
        System.out.println("자료구조/알고리즘 공부 2022년 6월 7일 ");
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
//        System.out.println(search(nums,0));
//        System.out.println(getSum(1, 2));
//        System.out.println(hammingWeight(00000000000000000000000000001011));
//        System.out.println(countBits(2));
        int[] nums2 = {3, 0, 1};
        System.out.println(missingNumber(nums2));
        int[][] matrix= { {1,1,1},{1,0,1},{1,1,1}};


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

    /*
    부호 없는 정수를 받아 '1' 비트 수( 해밍 가중치 라고도 함)를 반환하는 함수를 작성하세요 .
    메모:
    Java와 같은 일부 언어에는 부호 없는 정수 유형이 없습니다. 이 경우 입력은 부호 있는 정수 유형으로 제공됩니다.
    정수의 내부 이진 표현은 부호가 있든 없든 동일하므로 구현에 영향을 미치지 않아야 합니다.
    Java에서 컴파일러는 2의 보수 표기법 을 사용하여 부호 있는 정수를 나타냅니다 . 따라서 예 3 에서 입력은 부호 있는 정수를 나타냅니다. -3.
     */
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result + (n & 1);
            n = n >> 1;
        }
        return result;
    }

    /*
    정수가 주어지면 각 ( ) 에 대해 의 이진 표현에서 의 수가 되도록 길이 의 배열n 을 반환 합니다 .
    ansn + 1i 0 <= i <= nans[i]1i
     */
    public static int[] countBits(int n) {
        int[] f = new int[n + 1];
        for (int i=1; i<=n; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }

    /*
    범위의 고유한 숫자를 nums포함 하는 배열이 주어지면 배열 에서 누락된 범위의 유일한 숫자를 반환 합니다.n[0, n]
     */

    public static int missingNumber(int[] nums2) {
        int sum = 0;
        for (int i = 0; i < nums2.length; i++)
            sum += nums2[i] - i;
        return nums2.length - sum;
    }

    /*
    주어진 32비트 부호 없는 정수의 역 비트입니다.
     */

    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int ans = 0;
        // 32비트 제약
        for(int i=0; i<32; i++){
            ans = ans <<1;
            if((n & 1) >0){
                ans = ans | 1;
            }
            n = n >>1;
        }
        return ans;
    }

    /*
    m x n정수 행렬 이 주어지면 matrix요소가 0이면 전체 행과 열을 0'로 설정합니다.
    제자리에서 해야 합니다 .
     */
    public static void setZeroes(int[][] matrix) {

    }
}

