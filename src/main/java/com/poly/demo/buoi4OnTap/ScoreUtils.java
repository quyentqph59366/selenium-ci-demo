package com.poly.demo.buoi4OnTap;

public class ScoreUtils {

    public static double average(double... scores) {
        if (scores == null || scores.length == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }

        double sum = 0;
        for (double score : scores) {
            if (score < 0 || score > 10) {
                throw new IllegalArgumentException("Điểm phải từ 0 đến 10");
            }
            sum += score;
        }
        return sum / scores.length;
    }
}
