package com.zuri.jm.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class SortAlgorithmWithMethod {

    public static void main(String[] args) {

        // 배열 선언 -> 성적 배열
        int[] scores = {88, 55, 39, 100, 90, 100, 98, 67};

        // 성적 배열 -> 오름차순 정렬 -> Arrays.sort(배열);
        // 클래스 메서드로써 Arrays 클래스의 인스턴스 생성없이 바로 사용 가능.
        System.out.print("정렬 전 : ");
        for(int i=0; i<scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        // 메서드로 정렬
        Arrays.sort(scores);

        System.out.print("정렬 후 : ");
        for(int j=0; j<scores.length; j++) {
            System.out.print(scores[j] + " ");
        }

        System.out.println("");

        // 향상된 for문 사용
        System.out.print("정렬 전 : " );
        for(int i : scores)
            System.out.print(i + " "); System.out.println("");


        System.out.println("-----------------------------------------------");

        // 내림차순이거나 또는 원하는대로 정렬의 조건을 설정해서 하고자 할 때
        // 기본형(Primitive Type)의 배열에는 적용이 안된다. (ex. int[] scores)
        // 따라서, 래퍼 클래스(Integer 같은 큰 범위의 클래스)로 만들어서 적용해야한다.
        Integer[] scores2 = {88, 55, 33, 100, 90, 99 ,77, 66};

        System.out.print("정렬 전 : ");

        for (int i = 0; i<scores2.length; i++) {
            System.out.print(scores2[i] + " ");
        }

        // 성적 배열 -> 내림차순 정렬 -> Arrays.sort() -> import 필요 -> 추가 옵션 설정 필요 -> (배열명, 컬렉션 reverseOrder)
        Arrays.sort(scores2, Collections.reverseOrder());

        System.out.println("");
        System.out.print("정렬 후 : ");

        for (int j : scores2)
            System.out.print(j + " "); System.out.println("");

    }

}
