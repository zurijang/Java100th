package com.zuri.jm;

// getter, setter가 포함된 클래스의 상속을 코드로 구현해보시오.
// 부모 클래스 -> Person, 자식 클래스 -> Villain
// 부모 클래스의 Person은 OOP_Exam002 의 클래스를 사용

class Villain extends Person {

    // Field
    private String unique_key;
    private int weapon; // 1~9 숫자로 무기 분류 -> 1: 창, 2: 방패, 3: 총 ..
    private double power;

    // Constructor
    public Villain() {}
    // name, age, height, weight 부모 클래스의 요소
    public Villain(String name, int age, int height, int weight, String unique_key, int weapon, double power) {
        super(name, age, height, weight);
        this.unique_key = unique_key;
        this.power = power;
        this.weapon = weapon;
    }

    // Method
    public void setUnique_key(String unique_key) {
        this.unique_key = unique_key;
    }
    public String getUnique_key() {
        return this.unique_key;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
    public int getWeapon() {
        return this.weapon;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public double getPower() {
        return this.power;
    }

    // printPerson()
    public void printPerson() {
        // private 로 선언된 것은 메서드를 통해서 호출해야 함
        System.out.println("악당 이름 : " + this.name + ", 몸무게 : " + getWeight() + ", 키 : " + getHeight());
        System.out.println("악당 나이 : " + this.age + ", 무기 : " + getWeaponName(getWeapon()) + ", 파워 : " + this.power);
    }

    // getWeaponName()
    public String getWeaponName(int a) {
        String weapon;
        switch(a) {
            case 1:
                weapon = "창";
                break;
            case 2:
                weapon = "방패";
                break;
            case 3:
                weapon = "총";
                break;
            default:
                weapon ="-";
                break;
        }
        return weapon;
    }
}

public class OOP_Inheritance002 {

    public static void main(String[] args) {

        // 객체 생성
        Villain villain = new Villain();
        villain.setWeight(80);
        villain.setHeight(180);
        System.out.println(villain.getWeight() + " " + villain.getHeight());


        Villain villain2 = new Villain("좀비", 20, 180, 80, "15001231", 1, 200.3);
        villain2.printPerson();
    }

}
