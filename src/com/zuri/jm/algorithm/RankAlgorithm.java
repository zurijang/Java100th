package com.zuri.jm.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class RankAlgorithm {

    public static void printRanking(int[] scores, int[] ranking) {

        // 배열 길이
        int scores_len = scores.length;
        int ranking_len = scores_len;

        for (int i = 0; i < scores_len; i++) {
            System.out.print(scores[i] + "점 - " + ranking[i] + "등\t" );
        }
        System.out.println();

    }

    public static void main(String[] args) {

        // 배열 선언 -> 성적 배열, 랭킹 배열 2가지
        int[] scores = { 88, 50, 38, 100, 90, 100, 99, 75};
        int s_len = scores.length;
        int[] ranking = new int[s_len];

        // 오름차순 배열 정렬 -> Arrays.sort(배열) -> import 필요
        Arrays.sort(scores);

        // 반복문을 돌면서 랭킹 처리
        for (int i = 0; i < s_len; i++) {

            // 랭킹 초기화 -> 0 -> 랭킹에 0등은 없으니까 모두 1등으로 초기화
            ranking[i] = 1;
            //System.out.print(ranking[i] + " ");

            // 중첩 반복문
            for (int j = 0; j < s_len; j++) {

                if(scores[i] < scores[j]) {

                    ranking[i]++;

                }
            }
            //System.out.print(ranking[i] + " ");
        }
        // 출력 -> 별도의 메서드 호출
        printRanking(scores, ranking);
    }
}
