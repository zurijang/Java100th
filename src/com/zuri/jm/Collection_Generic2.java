package com.zuri.jm;

class Sample2<T> {
    // Field
    private T obj; // Type의 T

    // Constructor
    Sample2(T x) {this.obj = x;}

    // Method
    T getObj() {return obj;}
    void printInfo() {System.out.println(obj.getClass().getName());}

}

public class Collection_Generic2 {
    public static void main(String[] args) {

        // 객체 생성
        Sample2<String> s1 = new Sample2<String>("안녕하세요");
        System.out.println(s1.getObj());
        s1.printInfo();

        Sample2<Integer> s2 = new Sample2<Integer>(100);
        System.out.println(s2.getObj());
        s2.printInfo();
    }
}
