package com.algorithm.boostcourse;

public class comparable {
    public static void main(String[] args) {
        String one = "Hello World";
        String two = "Hello World";
        if(one.equals(two)){
            System.out.println("same");
        }


        Object o1 = "Hello world";
        Object o2 = "Hello world";
        if (o1.equals(o2)) {
            System.out.println("not same");  //메모리 주소를 반환하기 때문에 일치하지않는다.
        }


    }
}
