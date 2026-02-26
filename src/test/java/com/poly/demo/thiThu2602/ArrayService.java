package com.poly.demo.thiThu2602;

public class ArrayService {

    public int tinhTong(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Mảng không được null");
        }

        int sum = 0;
        for (int n : arr) {
            if (n < 1 || n > 1000) {
                throw new IllegalArgumentException("Phần tử phải từ 1-1000");
            }
            sum += n;
        }
        return sum;
    }
}