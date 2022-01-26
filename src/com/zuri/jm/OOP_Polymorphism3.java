package com.zuri.jm;


abstract class Car {

    abstract void run();

}

class Ambluance extends Car {
    void run() { System.out.println("앰블런스 지나가요");}
}

class Cultivator extends Car {
    void run() {System.out.println("경운기 지나가요");}
}

class SportsCar extends Car{
    void run() {System.out.println("스포츠카 지나가요");}
}

public class OOP_Polymorphism3 {

    public static void main(String[] args) {

        // 객체 생성
        Car c1 = new Ambluance();
        Car c2 = new Cultivator();
        Car c3 = new SportsCar();

        c1.run();
        c2.run();
        c3.run();

    }

}
