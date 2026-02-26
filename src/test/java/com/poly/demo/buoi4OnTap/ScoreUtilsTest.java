package com.poly.demo.buoi4OnTap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScoreUtilsTest {

    // TC1: Dữ liệu hợp lệ (phân vùng tương đương)
    @Test
    void testAverageNormal() {
        assertEquals(7.0, ScoreUtils.average(6, 7, 8));
    }

    // TC2: Giá trị biên dưới = 0
    @Test
    void testAverageWithZero() {
        assertEquals(5.0, ScoreUtils.average(0, 5, 10));
    }

    // TC3: Giá trị biên trên = 10
    @Test
    void testAverageWithTen() {
        assertEquals(10.0, ScoreUtils.average(10, 10, 10));
    }

    // TC4: Điểm không hợp lệ
    @Test
    void testInvalidScore() {
        assertThrows(IllegalArgumentException.class,
                () -> ScoreUtils.average(-1, 5, 6));
    }

    // TC5: Chia cho 0
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> ScoreUtils.average());
    }
}
