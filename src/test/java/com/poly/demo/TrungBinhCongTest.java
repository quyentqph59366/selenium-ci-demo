package com.poly.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrungBinhCongTest {

    private TrungBinhCong trungBinhCong;

    @BeforeEach
    void setUp() {
        trungBinhCong = new TrungBinhCong();
    }
    // ===== PHÂN VÙNG TƯƠNG ĐƯƠNG – HỢP LỆ =====

    @Test
    void tinhTrungBinh_MangNhieuPhanTu() {
        int[] arr = {2, 4, 6, 8};
        assertEquals(5.0, trungBinhCong.trungBinhCong(arr));
    }

    @Test
    void tinhTrungBinh_MangMotPhanTu() {
        int[] arr = {10};
        assertEquals(10.0, trungBinhCong.trungBinhCong(arr));
    }

    @Test
    void tinhTrungBinh_MangSoAm() {
        int[] arr = {-2, -4, -6};
        assertEquals(-4.0, trungBinhCong.trungBinhCong(arr));
    }

    @Test
    void tinhTrungBinh_MangHonHop() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(2.5, trungBinhCong.trungBinhCong(arr));
    }

    // ===== KIỂM THỬ BIÊN – NGOẠI LỆ =====

    @Test
    void tinhTrungBinh_MangRong() {
        int[] arr = {};
        assertThrows(
                IllegalArgumentException.class,
                () -> trungBinhCong.trungBinhCong(arr)
        );

    }

}