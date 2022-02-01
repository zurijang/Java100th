package com.zuri.jm.algorithm;

// continue label 이란 무엇인지 설명해보고 관련된 예제를 코드로 구현해보시오.

public class License_CosPattern3 {
    public static void main(String[] args) {
        // 이중 반복문
        outerloop: // continue label
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 10; j++) {
                // 출력 값
                int output = 10 * i + j;
                //System.out.print(output + " ");

                // 짝수만 출력
                if(output % 2 != 0) {
                    if(j==1){
                        // continue label
                        continue outerloop;
                    }
                    continue;
                }
                else {
                    System.out.print(output + " ");
                }
            }
            System.out.println();
        }
    }
}
