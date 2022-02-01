package com.zuri.jm.algorithm;

// 한 학급에서 반장 선거를 하는데 3명의 후보자를 두고 7명의 학생이 투표를 하였다.
// 1~3 번 까지의 후보자들중에서 과반수 이상 득표를 하면 당선이 된다.
// 투표 박스는 배열의 리스트로 제공되며 여기에 1~3번 각 후보자의 번호가 기표되어 있다.
// (1) 각 후보자가 득표한 득표 수 출력
// (2) 가장 많은 득표 수와 그때의 후보자 번호 출력
// (3) 가장 많은 득표를 한 후보자의 득표 수가 과반수 이상을 확보하였는지 체크하여 최종적인 당선 또는 미당선 출력

import java.util.Arrays;

class Pattern5_Solution {
    // Field

    // Constructor
    Pattern5_Solution(){}

    // Method
    public void solutionMethod(int n, int[] vote_box) {
        // 카운트(득표 수) 배열 선언 -> 정수형 배열은 0으로 초기화가 되어진다는 점을 화룡
        // 즉 처음에는 후보자 모두가 0 득표라고 초기화
        // 후보자는 1번 부터 있고 0번 후보는 없으니까 후보자 수 보다도 1 많게 배열의 크기를 만든다.
        int[] ar = new int[n+1];

        // 전달된 vote_box 배열을 반복문 돌면서 각 후보자별로 표를 받은 득표 수 계산
        for (int i = 0; i < vote_box.length; i++) {
            ar[vote_box[i]]++;
        }

        // 각 후보자 득표 수 출력
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        // ar 카운트 배열에서 가장 많은 득표 수와 그때의 후보자 번호 출력 -> 최댓값 알고리즘 문제
        // 먼저 max 변수에 0 또는 ar 배열의 첫 번재 값을 셋팅하고, 반복문을 돌면서 각 요소와 맥스값을 비교하면서 더 큰 값을 저장
        // 이때, 0번 후보자인 배열 0번은 항상 0값이므로 1부터 순회
        /*int rst_candidate = 0, rst_max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] > rst_max) {
                rst_candidate = i;
                rst_max = ar[i];
            }
        }
        System.out.println("가장 많은 득표 수 : " + rst_max);
        System.out.println("가장 많은 득표 수의 후보자 : " + rst_candidate);*/

        // ar 배열에서 가장 적은 드표 수, 가장 많은 득표 수 구하기
        // sort 함수 사용 -> 오름차순 -> 배열 첫 번째 값 : 최솟값, 마지막 값 : 최댓값
        Arrays.sort(ar);

        int rst_max = ar[ar.length - 1];
        int rst_min = ar[1];

        System.out.println("가장 적은 득표 수(최솟값)은 = " + rst_min);
        System.out.println("가장 많은 득표 수(최댓값)은 = " + rst_max);

        // 과반 수 여부 체크
//        System.out.println(vote_box.length / (double)2); // 과반수 값
//        boolean aaa = 4 > 3.5;  // 득표 받은수와 과반수 값 비교
//        System.out.println(aaa); // 결과 출력

        boolean majority = rst_max > (vote_box.length / (double)2);
        if(majority)
            System.out.println("과반수 이상 득표했습니다. -> 당선");
        else
            System.out.println("과반수 이상 실패했습니다. -> 미당선");

    }

}

public class License_CosPattern5 {
    public static void main(String[] args) {

        // 객체 생성
        Pattern5_Solution s1 = new Pattern5_Solution();

        // 득표한 표 수를 저장하는 정수형 배열 선언
        int[] vote_box = {1, 3, 1, 3, 3, 2, 2};

        // solutionMethod() 호출 -> 2개 입력 파라미터 값 전달 -> 후보자 수, 득표 수 배열
        s1.solutionMethod(3, vote_box);

    }

}
