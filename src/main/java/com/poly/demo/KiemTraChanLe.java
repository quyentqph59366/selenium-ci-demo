package com.poly.demo;

public class KiemTraChanLe {

    public boolean laSoChan(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Không kiểm tra số âm");
        }
        return n % 2 == 0;
    }
}
