package com.poly.demo.thiThu2602;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayServiceTest {

    ArrayService service = new ArrayService();

    // TC1: Phân vùng hợp lệ (giá trị bình thường)
    @Test
    void testTinhTong_HopLe() {
        int[] arr = {10, 20, 30};
        assertEquals(60, service.tinhTong(arr));
    }

    // TC2: Biên dưới hợp lệ (1)
    @Test
    void testTinhTong_BienDuoi() {
        int[] arr = {1, 1, 1};
        assertEquals(3, service.tinhTong(arr));
    }

    // TC3: Biên trên hợp lệ (1000)
    @Test
    void testTinhTong_BienTren() {
        int[] arr = {1000, 1000};
        assertEquals(2000, service.tinhTong(arr));
    }

    // TC4: Ngoài biên (<1)
    @Test
    void testTinhTong_NgoaiBienDuoi() {
        int[] arr = {0, 5};
        assertThrows(IllegalArgumentException.class,
                () -> service.tinhTong(arr));
    }

    // TC5: Ngoài biên (>1000)
    @Test
    void testTinhTong_NgoaiBienTren() {
        int[] arr = {1001};
        assertThrows(IllegalArgumentException.class,
                () -> service.tinhTong(arr));
    }

    // TC6: Null array
    @Test
    void testTinhTong_Null() {
        assertThrows(IllegalArgumentException.class,
                () -> service.tinhTong(null));
    }
}