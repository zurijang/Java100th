package com.zuri.jm;

public class Method_TwoReturn1 {

    public static int[] testMethod() {
        int num1 = 100;
        int num2 = 200;

        return new int[] {num1, num2};
    }

    public static void main(String[] args) {

        int[] result = testMethod();

        System.out.println(result[0]);

    }

}
