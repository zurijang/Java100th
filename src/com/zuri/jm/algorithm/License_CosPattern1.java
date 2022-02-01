package com.zuri.jm.algorithm;

// 배열내 숫자들의 각 빈도 수를 출력하는 코드를 구현하시오.

public class License_CosPattern1 {

    public static void main(String[] args) {

        // 배열 선언
        int[] target = { 1, 3, 3, 2, 1, 1, 3, 0, 1, 2};

        // 배열내 각 숫자들의 빈도 수 출력하기
        // 1 -> 빈 정수형 배열(ar)을 하나 만들어놓고 초깃값은 모두 0으로 셋팅한다.
        // 2 -> target 배열내 숫자가 빈 배열(ar)의 인덱스로 적용되서 해당 인덱스의 ar 배열 요소의 값을 1씩 증가
        // 3 -> 이때, 빈 배열(ar)의 요소 갯수는 target 배열내 숫자들의 종류 만큼 지정

        // 0, 1, 2, 3 (총 4개)
        // 정수형 배열은 선언하면 초깃값은 0으로 자동 세팅됨
        int[] ar = new int[4];

        for (int i=0; i<target.length; i++) {

            ar[target[i]]++;

        }

        System.out.print(ar[0] + " " + ar[1] + " " + ar[2] + " " + ar[3]);


    }

}
