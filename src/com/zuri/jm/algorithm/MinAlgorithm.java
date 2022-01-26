package com.zuri.jm.algorithm;

public class MinAlgorithm {

    public static void main(String[] args) {

        // 배열 선언
        int[] ar = {4, 13, 15, 17, -2};

        // 반복문을 사용하지 않고 최대 최소값 구하기
        // 일단 배열내 첫번째 원소의 값이 제일 크다고 가정하고 초기화 : max값 구하기
        // 배열 내 첫번째 원소의 값이 제일 작다고 가정하고 초기화 : min값 구하기
        int min = ar[0];

        System.out.println("현재 배열내 가장 작은 값은 : " + min);

        for(int i = 0; i < ar.length; i++) {

            if(min > ar[i]) {
                min = ar[i];
            }

        }
        System.out.println("");
        System.out.println("현재 배열내 가장 작은 값은 : " + min);

    }

}
