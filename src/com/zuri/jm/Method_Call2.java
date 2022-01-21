package com.zuri.jm;

public class Method_Call2 {

    public static void sum(TestNumber a) {

        a.num += 400;

        System.out.println("method :: " + a);
        System.out.println("method :: " + a.num);
    }

    // call by reference
    public static void main(String[] args) {

        TestNumber a = new TestNumber(100);
        sum(a);

        System.out.println("main :: " + a);
        System.out.println("main :: " + a.num);

    }

}

class TestNumber {
    int num;
    TestNumber(int num) {this.num = num;}
}
