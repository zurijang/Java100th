package com.zuri.jm;

// 컬렉션 프레임워크의 ArrayList 기반으로 2차원 배열을 만들어 요소를 추가하고 출력해보시오.

import java.util.ArrayList;

public class Collection_FrameworkArrayList3 {
    public static void main(String[] args) {

        // 배열 선언
        ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();

        // 요소 추가 add
        arr.add(new Integer[]{11, 12, 13, 14});
        list1.add(new ArrayList<Integer>());
        list1.get(0).add(11);
        list1.get(0).add(12);
        list1.get(0).add(13);

        arr.add(new Integer[]{21, 22, 23, 24});
        list1.add(new ArrayList<Integer>());
        list1.get(1).add(21);
        list1.get(1).add(22);
        list1.get(1).add(23);

        System.out.println(list1.toString());

        // 요소 출력
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i)[0]);
        }

        // 전체 요소 출력 -> 이중 반복문 -> 그런데 그전에 안쪽 배열의 사이즈를 미리 체크
        // size() 컬렉션 프레임워크 타입의 길이
        // length() 문자열의 길이
        // length 배열의 길이
        System.out.println(arr.get(0).length); // arr.get(0) 은 배열이므로 arraylist의 메서드 사용 불가

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).length; j++) {
                System.out.print(arr.get(i)[j] + " ");
            }
            System.out.println();
        }

    }
}
