package com.zuri.jm;

// 모든 타입을 다 받는 클래스를 만들어보시오.
// 모든 자료형의 조상 Object

class Sample {
    // Field
    private Object obj;

    // Constructor
    Sample(Object x) {
        this.obj = x;
    }

    // Method
    public Object getObj() {
        return obj;
    }

    void printInfo() {
        System.out.println(obj.getClass().getName()); // 객체가 속하는 클래스의 정보 출력
    }
}

public class Collection_Generic1 {

    public static void main(String[] args) {
        // 객체 생성 -> 문자열
        Sample s1 = new Sample("오하이요오");
        System.out.println(s1.getObj());
        s1.printInfo();

        // 객체 생성 -> 숫자
        Sample s2 = new Sample(100);
        System.out.println(s2.getObj());
        s2.printInfo();

        Sample s3 = new Sample(new Object());
        System.out.println(s3.getObj()); // 객체의 주소값 출력됨
        s3.printInfo();
    }
}
