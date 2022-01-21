package com.zuri.jm;

// FarmMachine
class FarmMachine {

    // [1] : 속성(특징)
    int price;      // 가격
    int year;       // 연식
    String color;   // 색상

    // [2] : 동작 / 기능 / 행동 (메소드)
    // 농기계 마다 동작이 다양할 것이므로 처음에는 공통적인 동작을 생각해본다.
    public FarmMachine(int price, int year, String color) {
        this.price = price;
        this.year = year;
        this.color = color;
    }

    void move() {
        System.out.println("Farm-machine is moving.");
    }

    void dig() {
        System.out.println("Farm-machine is digging.");
    }

    void grind() {
        System.out.println("Farm-machine is grinding.");
    }

}

public class OOP_Exam001 {

    public static void main(String[] args) {

        // [1] : 객체 생성
        FarmMachine fm = new FarmMachine(1000,2020,"Yellow");
        System.out.println("FarmMachine Info is " + fm.color + fm.price + fm.year);
        fm.dig();
        fm.move();
        fm.grind();

    }

}
