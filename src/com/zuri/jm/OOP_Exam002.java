package com.zuri.jm;

// 객체 생성시 초깃값을 생성자 메서드에서 설정하는 클래스를 구현해보시오.

class Person {

    // 속성(Attribute)
    int age;
    String name;
    int gender;
    int power;
    // private 멤버필드 외부에서 수정,변경 불가능. 프로그램의 안정성 높이는 방법
    // setter, getter 필요
    private int height;
    private int weight;

    // 생성자(Constructor)
    Person() {
        this.gender = 1; // 1:남성, 2:여성
        this.power = 100; // 기본파워
    }

    Person(int age) {
        this.age = age;
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // 메서드(Method)
    void printPerson() {
        System.out.println("나이 : " + age + ", 이름 : " + name);
    }

    void walk() {
        System.out.println("걸어가고 있어요~");
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return this.height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return this.weight;
    }
}

public class OOP_Exam002 {

    public static void main(String[] args) {

        // person에 객체의 주소값을 저장
        // 변수의 값들을 저장하는 것이 아닌 주소값만을 전달 (참조)
        Person person = new Person();
        person.printPerson();

        Person person2 = new Person(1,"zuri");
        person2.printPerson();
        System.out.println(person2.age + person2.name);

        Person person3 = new Person("dummy");
        person3.printPerson();

        Person person4 = new Person(2);
        person4.printPerson();

    }

}
