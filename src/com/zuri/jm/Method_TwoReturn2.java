package com.zuri.jm;

import java.util.Scanner;

public class Method_TwoReturn2 {

    public static String[] capitalMethod(String a, String b) {

        String a_ = a.toUpperCase();
        String b_ = b.toLowerCase();

        return new String[]{a_, b_};
    }

    public static void main(String[] args) {

        String[] result = capitalMethod("korea", "USA");

        System.out.println(result);
        System.out.println(result[0] + " " + result[1]);

    }

}
