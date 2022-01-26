package com.zuri.jm.algorithm;

public class RandomMaxMinAlgorithm {

    public static void main(String[] args) {

        // 정수 배열 선언
        int[] ar = new int[10];

        // 반복문을 돌면서 랜덤으로 10개 정수 값 세팅 -> Math.random();
        for(int i = 0; i < ar.length; i++) {
            ar[i] = (int) Math.random() * 100;
        }

        int max = ar[0], min = ar[0];

        // 반복문을 돌면서 최댓값, 최솟값 비교
        for (int i = 0; i < ar.length; i++) {
            if(max<ar[i]) max = ar[i];
            if(min>ar[i]) min = ar[i];
        }

    }

}
