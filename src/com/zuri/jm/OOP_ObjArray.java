package com.zuri.jm;

// 객체에 대한 참조값을 요소로 가지는 객체 배열 코드를 구현하시오.

class Person2 {

    // Field
    private String name;
    private int age;

    // Constructor
    Person2() {}
    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

}

public class OOP_ObjArray {

    public static void main(String[] args) {

        // 객체 생성
        int[] ar1 = {1, 2, 3, 4, 5};
        char[] ar2 = {'A', 'B', 'C', 'D', 'E'};
        // 5개 객체를 저장할 수 있는 객체 배열 선언
        Person2[] pa = new Person2[5];

        pa[0] = new Person2("홍길동", 20);
        pa[1] = new Person2("심청이", 18);
        pa[2] = new Person2("개구리", 21);
        pa[3] = new Person2("흥부", 35);
        pa[4] = new Person2("놀부", 30);

        // 출력
        for(int i=0; i<ar1.length; i++) {
            System.out.print(ar1[i]);
        }
        System.out.println();

        for(int j=0; j<ar2.length; j++) {
            System.out.print(ar2[j]);
        }
        System.out.println();

        for (int z=0; z<pa.length; z++) {
            System.out.println(pa[z].getName() + " " + pa[z].getAge());
        }

    }

}
