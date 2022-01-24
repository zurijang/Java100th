package com.zuri.jm;

// 추상 클래스와 추상 메서드란 무엇인지 설명하고 관련된 예제 코드를 구현해보시오.

// 추상(abstract) 클래스
abstract class Animal {
    // 구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언
    // 리턴값 조차도 없이 메서드명만 선언
    // 상속받는 클래스에서 구현
    abstract void cry();
    void eat() { System.out.println("먹다");}
}

class Dog extends Animal {
    void cry() { System.out.println("멍 멍 멍!");}
}

class Cat extends Animal {
    void cry() { System.out.println("야옹 야옹 야옹");}

    void eat() {
        System.out.println("먹다먹다먹다");
    }
}

class Animal2 {
    void fly() {
        System.out.println("날다 날다 날다");
    }
}

public class OOP_AbstractClassMethod {

    public static void main(String[] args) {

        // 추상 클래스는 구체적인 내용이 없기 때문에 객체를 생성할 수 없음
        // Animal dog = new Animal();  (X)
        Animal2 dragonfly = new Animal2();


        // 추상 클래스 사용은? -> 상속을 받아서 사용
        // 즉, 추상(부모) 클래스를 상속받은 자식 클래스에서 해당 메서드를 사용
        // 해당 메서드를 오버라이딩하여 재정의한 후 사용
        Dog dog = new Dog();
        dog.cry();
        dog.eat();

        Cat cat = new Cat();
        cat.cry();
        cat.eat();

    }

}
