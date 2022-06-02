package com.algorithm;

public class JavaEnumExample {
    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.HOT_AMERICANO);


        System.out.println("반복문 사용");
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type);
        }

        /*
        Enum
         - 매직넘버를 사용할 떄보다 코드가 명확해 진다. 프로그래밍에서 상수로 선언하지 않은 숫자를 매직넘버라고 한다.
         - 잘못된 값을 사용함으로 인해 발생할수 있는 위험성이 사라진다.
         */
    }
}
