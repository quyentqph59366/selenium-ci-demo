package com.poly.demo.buoi4OnTap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentGraderTest {

    @Test
    void testGradeF() {
        assertEquals("F", StudentGrader.grade(40));
    }

    @Test
    void testGradeD() {
        assertEquals("D", StudentGrader.grade(50));
    }

    @Test
    void testGradeC() {
        assertEquals("C", StudentGrader.grade(65));
    }

    @Test
    void testGradeB() {
        assertEquals("B", StudentGrader.grade(75));
    }

    @Test
    void testGradeA() {
        assertEquals("A", StudentGrader.grade(90));
    }

    @Test
    void testInvalidScore() {
        assertThrows(IllegalArgumentException.class,
                () -> StudentGrader.grade(120));
    }
}
