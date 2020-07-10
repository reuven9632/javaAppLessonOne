package com.company;

public class OverloadFunction {
    public static int summ (int a, int b) {
        return a + b;
    }
    public static int summ (int a, int b, int c) {

        return a + b + c;
    }
    public static float summ (float a, float b, float c) {

        return a + b + c;
    }
    public void out () {
        System.out.println(summ(11,22));
        System.out.println(summ(11,22, 33));
        System.out.println(summ(11.22f,22.33f, 33.44f));//важно добавлять f в конце после каждого числа!!!
        //System.out.println должна находиться в методе для коректной работы!!!

    }
}
