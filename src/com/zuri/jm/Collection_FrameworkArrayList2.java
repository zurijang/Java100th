package com.zuri.jm;
// ArrayList를 이용한 자료의 추가, 수정, 삭제, 출력 구현

import java.util.ArrayList;

public class Collection_FrameworkArrayList2 {
    public static void main(String[] args) {
        // ArrayList 객체 생성 -> 제네릭을 사용
        ArrayList<String> list = new ArrayList<String>(); // ArrayList 데이터의 타입 명시

        // 추가 -> add()
        list.add("홍길동");
        list.add("이순신");
        list.add("강감찬");
        list.add("을지문덕");
        list.add("김유신");

        System.out.println(list.toString());
        System.out.println(list.get(4));

        String str = list.get(0); // 형변환 할 필요 없이 바로 사용 가능 , 타입 안정성 향상
        System.out.println(str);

        // 수정 -> set(인덱스, 수정값)
        list.set(0, "신사임당");
        System.out.println(list.get(0));

        // 삭제 -> 2가지 생각 ( 하나만 삭제 / 한꺼번에 삭제 ) -> remove(인덱스)
        list.remove(1);
        System.out.println(list.toString());

        // 출력
        for (String str1 : list) {
            System.out.println(str1);
        }

        // 한꺼번에 삭제 -> removeAll(배열명)
        list.removeAll(list);
        System.out.println(list.toString());

    }
}
