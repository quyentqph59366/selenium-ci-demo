package com.poly.demo;

public class TinhTuoi {

    public int calculateAge(int birthYear) {

        if (birthYear > 2025) {
            throw new IllegalArgumentException("Năm sinh không hợp lệ");
        }

        if (birthYear < 1900) {
            throw new IllegalArgumentException("Năm sinh quá xa");
        }

        return 2025 - birthYear;
    }
}
