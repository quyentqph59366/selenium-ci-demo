package com.poly.demo;

import javax.swing.*;

public class TrungBinhCong {

    public double trungBinhCong(int[] arr) {
        if (arr.length == 0 || arr == null) {

            throw new IllegalArgumentException("Mảng rỗng");
        }
        ;
        int sum=0;

        for (int x : arr) {
            sum +=x;
        }

        return (double) sum/arr.length;
    }


}
