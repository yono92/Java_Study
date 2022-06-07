package com.algorithm.algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Algo0606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[안내] 0을 입력하시면 입력이 종료 됩니다.");

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();


        int count = 1;
        while(true) {
            System.out.print("숫자 " + count++ + " : ");

            int num = scanner.nextInt();
            int[] arr = new int[num];

            if (num == 0) {
                break;
            }
                if(set.contains(num) ){
                    //list에 포함되어 있는지 아닌지 체크
                    System.out.println("[입력오류] : 이미 입력된 숫자 입니다.");
                } else if (isPrime(num)) {
                    set.add(num);      //해당 값이 없으면 넣기
                }


        }

        System.out.print("결과 : " + set);

        for (int i = 0; i < set.size(); i++) {
            if (i < set.size() - 1) {
                System.out.print(", ");
            }
        }

    }

    private static boolean isPrime(int num) {

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num == 1 || num % 1 ==0) {
                return false;
            }  else if (num==2){
                return true;
            }
        }

        return true;
    }

}

