package com.zuri.jm;

class Parent {
    String str1 = "부모 클래스";
    void method1() { System.out.println("메서드1");}
    void ppp() {System.out.println("ppp");}

}

class Child extends Parent {
    String str2 = "자식 클래스";
    void method1() { System.out.println("메서드1 오버라이딩");}
    void sss() {System.out.println("sss");}
    void x() {
        method1();
        super.method1();
    };

}

public class OOP_Polymorphism {

    public static void main(String[] args) {

        // 객체 생성
        Parent p1 = new Parent();
        // 하위(자식) 클래스로 객체를 만들면서 타입은 상위(부모) 타입을 쓰는 것이 가능 -> 다형성
        Parent p2 = new Child();


        Child c1 = new Child();
        // Child c2 = new Parent(); // 에러 다형성에 어긋남
    }

}
