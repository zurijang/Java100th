package com.zuri.jm;

// 자식 클래스로 생성하는 객체를 부모의 타입으로 받아서 객체를 생성하면 사용범위가 어떻게 되는지 확인해봐라.
// OOP_Polymorphism.java의 Parent, Child 클래스를 활용


public class OOP_Polymorphism2 {

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.str1);
        System.out.println(c.str2);
        c.method1();
        c.sss();
        c.ppp();
        // [!] : 자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶으면?
        System.out.println("자식 클래스에서 오버라이딩된 부모 클래스의 원본 메서드를 호출하고 싶으면?");
        c.x();


        // 부모의 자원만 쓸 수 있다.
        // 자식의 자원은 못쓰지만 오버라이딩된 메서드는 반영됨?
        // Why?
        Parent p = new Child();
        p.method1(); // 오버라이딩된 메서드
        System.out.println(p.str1);
        //System.out.println(p.str2); // 자식클래스 활용 x  에러남
        p.ppp();
        //p.sss();  // 자식 클래스 활용 x  에러남
        // [!] : 자식클래스의 메서드를 사용하고 싶다면? 바로 호출하고 싶다면?
        ((Child) p).sss();

    }

}
