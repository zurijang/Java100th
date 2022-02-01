package com.zuri.jm;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_FrameworkArrayListWithIterator1 {
    public static void main(String[] args) {

        // 객체 생성
        ArrayList<String> list = new ArrayList<String>();

        // 요소 추가
        list.add("Alligator");
        list.add("Hippo");
        list.add("Ostrich");
        list.add("Donkey");

        // Iterator(반복자) 객체 생성
        // 객체 생성 과정도 중요
        // Collection 인터페이스 -> Iterator() 메서드를 정의하고 있고 -> 이를 상속받는게 List, Set 인터페이스이므로
        // List, Set 인터페이스를 상속받아 구현한 클래스들 객체를 통해서 iterator() 메서드를 사용
        // list.iterator().hasNext();
        Iterator<String> iter = list.iterator();

        // 요소 출력
        for (String s : list)
            System.out.println(s);

        // 요소 출력 2 - while 반복문 사용
        // iterator(반복자) 메서드 사용 -> hasNext(), next(), remove();
//        System.out.println(iter.hasNext()); // true
//        System.out.println(iter.next()); // Alligator
//        System.out.println(iter.hasNext()); // true
//        System.out.println(iter.next()); // Hippo
//        System.out.println(iter.hasNext()); // true
//        System.out.println(iter.next()); // Ostrich
//        System.out.println(iter.hasNext()); // true
//        System.out.println(iter.next()); // Donkey
//        System.out.println(iter.hasNext()); // false
        while(iter.hasNext()) {
            // Hippo 만 출력
            String str = iter.next();
            if(str.equals("Hippo"))
                System.out.println(str);
            
            // 전체 요소 출력
            // System.out.println(iter.next());

            // Hippo 만 삭제
            if(str.equals("Hippo")) {
                iter.remove();
                System.out.println("하마 삭제");
            }
        }

        // 삭제 된 것 확인
        for (String s : list) {
            System.out.println(s);
        }


    }
}
