package com.zuri.jm;

// Car, Ambulance, Cultivator, SportCar 클래스는 OOP_Polymorphism3.java 를 이용
// 다형성을 활용한 객체 생성시 배열과 반복문을 사용하여 객체 생성


public class OOP_Polymorphism4 {

    public static void main(String[] args) {

        // 배열 길이가 3인 Car 객체 배열 선언
        Car[] cars = new Car[3];

        // cars 배열 초기화
        cars = new Car[] {new Ambluance(), new Cultivator(), new SportsCar()};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);


        // 자식 클래스로 객체 생성 -> 타입은 부모 타입 -> 생성된 객체들 배열 초기화 -> 다형성 덕분
        Car[] cars2 = {new Ambluance(), new Cultivator(), new SportsCar()};

        // 반복문 돌면서 각 개체의 run() 메서드 호출
        for (int i = 0; i < cars2.length; i++) {
            cars2[i].run();
        }

        // 향상된 for 문
        for (Car obj : cars2) {
            obj.run();
        }

    }

}
