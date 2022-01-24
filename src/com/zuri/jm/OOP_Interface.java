package com.zuri.jm;

// 클래스로 할 경우 단일 상속
// 여러개를 상속 받으려 할 경우 인터페이스 사용 (다중 상속)

// Person 클래스(부모)
class PersonVO {
    // Field
    String name;
    int age;
    int weight;

    //Constructor
    PersonVO() {}
    PersonVO(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Method
    void wash() {
        System.out.println("씻다.");
    }
    void study() {
        System.out.println("공부하다.");
    }
    void play() {
        System.out.println("놀다.");
    }
}

// A 인터페이스 (부모) 용돈
interface Allowance {
    // Field
    // 변수는 안되나 상수는 가능, 상수로 지정해주면 됨
    // public static final 을 붙여주면 됨
    // 인터페이스 내 모든 멤버 필드(변수)는 public static final 이여야 함 -> 생략이 가능 -> 그냥  "타입 상수명" 지정해서 쓰면 됨
    public static final int YEAR = 2022;
    public static final String COUNTRY = "KOREA";

    // 인터페이스는 추상 메서드만 사용할 수 있다. abstract 를 붙여야 함 -> abstract 생략 가능
    // Abstract Method
    abstract void in(int price, String name);
    abstract void out(int price, String name);
}

// B 인터페이스 (부모)
interface Train {
    // Abstract Method
    abstract void train(int training_pay, String name);
}

// Student 클래스(자식)
class StudentVO extends PersonVO implements Allowance, Train {
    // Field


    // Constructor
    StudentVO() {}
    StudentVO(String name, int age, int weight) {
        // 부모의 생성자
        super(name, age, weight);
    }

    // Method
    public void in(int price, String name) {
        System.out.printf("%s에게서 %d원 용돈을 받았습니다.\n",name,price);
    }
    public void out(int price, String name) {
        System.out.printf("%d원 금액을 지출했습니다. [지출용도 -> %s]\n",price, name );
    }
    public void train(int training_pay, String name) {
        System.out.printf("[%s -> %d원 입금완료]\n", name, training_pay);
    }
}

// 메인 클래스 (메인 메서드 포함)
public class OOP_Interface {

    public static void main(String[] args) {

        // 객체 생성
        StudentVO s1 = new StudentVO("홍길동", 20, 85);

        // 클래스와 인터페이스로 부터 상속(PersonVO)과 구현(Allowance, Train)을 한 메서드들 호출
        s1.in(10000, "엄마");
        s1.out(5000, "아빠");
        s1.train(50000, "누나");

        s1.wash();
        s1.study();
        s1.play();

        // 상수 필드 사용하기
        System.out.println(s1.COUNTRY);
        System.out.println(s1.YEAR);

        System.out.println(Allowance.COUNTRY);
        System.out.println(Allowance.YEAR);
    }

}