package com.zuri.jm;

// 1부터 10 사이의 수샂가 무작위로 10개 출력되는 코드 구현
// 0은 출력되면 안된다.

public class Package_MathRandom {
    public static void main(String[] args) {
        // 반복문 -> 랜덤 숫자 생성
        // 랜덤 숫자 생성중 0을 제외하려면? -> 결과로 나오는 숫자에 1을 더해준다.
        for (int i = 0; i<10; i++) {
            System.out.println((int)(Math.random() * 10) + 1);
        }
    }
}
