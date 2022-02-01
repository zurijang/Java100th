package com.zuri.jm.algorithm;

// 홀수, 짝수 구하기 문제를 while 반복문과 continue를 사용하여 구현
// 1~30까지의 수에서 짝수만 출력

public class License_CosPattern2 {

    public static void main(String[] args) {

        // 변수 선언
        int number = 1;

        // 반복문 돌면서 홀수인지 체크 -> 홀수면 pass(continue)
        while(number++ <= 30) {
            if(number % 2 != 0) {
                continue;
            }
            System.out.print(number + " ");
        }

        System.out.println();


    }

}
