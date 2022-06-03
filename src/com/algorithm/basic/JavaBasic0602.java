package com.algorithm.basic;

import java.util.ArrayList;
import java.util.Comparator;

public class JavaBasic0602 {
    public static void main(String[] args) {
        //StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료 형이다.
        StringBuffer sb =new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("Jump to java");
        String result = sb.toString();
        System.out.println(result);
        //StringBuilder는 멀티 스레드 환경에서 안전하다는 장점이 있고 성능이 우수하다. 따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuilder사용이 유리하다.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("String");
        sb2.append(" ");
        sb2.append("Builder");
        String result2 = sb2.toString();
        System.out.println(result2);


    }
}
