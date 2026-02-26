package com.poly.demo;

public class Divide {

    public int chia(int a, int b) {
        if (a<0 || a>1000 || b<0 || b>1000)

            throw new IllegalArgumentException("Giá trị trong khoảng từ 0-1000");

        if (b==0)
            throw new ArithmeticException("Không chia được cho 0");

        return a / b;
    }

}
