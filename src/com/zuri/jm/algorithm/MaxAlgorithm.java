package com.zuri.jm.algorithm;

import java.util.Arrays;

public class MaxAlgorithm {

    public static void main(String[] args) {

        // 배열 선언
        int[] ar = {4, 13, 15, 17, -2};

        // max min 함수
        System.out.println(Math.max(10, 4)); // 10
        System.out.println(Math.min(10,4)); // 4

        // 반복문을 사용하지 않고 최대 최소값 구하기
        // 일단 배열내 첫번째 원소의 값이 제일 크다고 가정하고 초기화
        int max = ar[0];

        System.out.println("현재 배열내 가장 큰 값은 : " + max);

        for(int i = 0; i < ar.length; i++) {

            if(max < ar[i]) {
                max = ar[i];
            }

        }
        System.out.println("");
        System.out.println("현재 배열내 가장 큰 값은 : " + max);



    }

}
