package com.zuri.jm;

import java.util.ArrayList;

public class Collection_FrameworkArrayList1 {
    public static void main(String[] args) {

        // ArrayList를 제네릭이 아닌 Object 타입으로 사용하는 경우
        ArrayList ar = new ArrayList();

        // 데이터 추가하기 -> add()
        ar.add("장주영"); // 문자열 자료형 저장
        ar.add("홍길동");
        ar.add(1); // 정수형 자료형 저장
        ar.add(2.33); // 실수형 자료형 저장
        ar.add(true);
        ar.add(1); // 중복 허용
        ar.add(new Object());

        // 데이터 가져요기 -> get() -> 이 때, 해당 데이터 자료형으로 형변환하여 사용한다.
        System.out.println(ar.toString());
        System.out.println(ar.get(0));
        System.out.println(ar.get(3));

        String str = (String)ar.get(0); // 제네릭을 쓰지 않을 때의 주의점
        System.out.println(str.length()); // String 클래스의 메서드 사용
    }
}
