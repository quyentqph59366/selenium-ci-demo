package com.poly.demo.buoi4OnTap;

public class StudentGrader {

    public static String grade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Điểm không hợp lệ");
        }

        if (score <= 40) return "F";
        if (score <= 60) return "D";
        if (score <= 70) return "C";
        if (score <= 80) return "B";
        return "A";
    }
}

