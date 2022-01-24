package com.zuri.jm;

// 클래스의 상속을 코드로 구현해보시오.
// Person Class는 OOP_Exam002의 Class를 이용

class Hero extends Person {

    // Field


    // Constructor
    public Hero() {
        super(1); // 부모 클래스의 생성자 호출
        gender = 2;
        power = 500;
    }

    // Method

    public void walk() {
        System.out.println("히어로는 걷지 않아요. 날아요.");
    }

    public void eat() {
        System.out.println("밥먹고 있어요~");
    }

    public void displayPerson() {
        System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender );
    }
}

class Student extends Person {

}

class Teacher extends Person {

}

public class OOP_Inheritance001 {

    public static void main(String[] args) {

        // 객체 생성
        Hero hero = new Hero();
        hero.name = "스파이더맨";
        hero.printPerson();
        hero.walk();
        System.out.println(hero.power + " " + hero.gender); // hero 클래스 생성자의 초기값

    }

}
