package com.zuri.jm;

public class Method_Call1 {

    public static void sum(int a) {
        a += 400;
        System.out.println("In method : " + a);
    }

    public static void main(String[] args) {

        int a = 100;
        sum(a);

        System.out.println("In main : " + a);

    }

}
