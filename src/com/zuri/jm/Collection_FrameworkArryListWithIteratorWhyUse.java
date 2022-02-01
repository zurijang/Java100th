package com.zuri.jm;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_FrameworkArryListWithIteratorWhyUse {
    public static void main(String[] args) {

        // 객체 생성
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 요소 추가
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 출력 요소 삭제 전
        for (Integer num : list) {
            System.out.print(num + " " );
        }
        System.out.println();

        // 반복문 없이 한 개의 요소만 삭제
        System.out.println(list.get(2)); // 3
        list.remove(2);            // 3 삭제
        System.out.println(list.get(2)); // 4

        // while 반복문 사용하여 요소 삭제
        System.out.println("------------------- while 반복문 사용 요소 삭제");
        /* Err for(Integer i : list) {
            System.out.print(i + " ");
            //list.remove(i); 삭제 수정하려할 때 에러 발생 ConcurrentModificationException
        }*/
        // Iterator(반복자) 객체 생성
        Iterator<Integer> iter = list.iterator();

        while(iter.hasNext()) {
            Integer i = iter.next();
            if(i==2) {
                iter.remove();
            }
        }
        // 출력 요소 삭제 후
        for (Integer num : list) {
            System.out.print(num + " " );
        }
        System.out.println();
        System.out.println("------------------- while 반복문 사용 요소 삭제");


    }
}
