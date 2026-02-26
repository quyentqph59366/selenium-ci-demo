package com.poly.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTuoiTest {

    private TinhTuoi tinhTuoi;

    @BeforeEach
    void setUp() {
        tinhTuoi = new TinhTuoi();
    }

    // ===== PHÂN VÙNG HỢP LỆ =====

    @Test
    void tinhTuoi_HopLe_BinhThuong() {
        assertEquals(25, tinhTuoi.calculateAge(2000));
    }

    // ===== KIỂM THỬ BIÊN =====

    @Test
    void tinhTuoi_BienDuoi_HopLe() {
        assertEquals(125, tinhTuoi.calculateAge(1900));
    }

    @Test
    void tinhTuoi_BienTren_HopLe() {
        assertEquals(0, tinhTuoi.calculateAge(2025));
    }

    // ===== NGOẠI LỆ =====

    @Test
    void tinhTuoi_NamSinhLonHonNamHienTai() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> tinhTuoi.calculateAge(2026)
        );
        assertEquals("Năm sinh không hợp lệ", ex.getMessage());
    }

    @Test
    void tinhTuoi_NamSinhQuaXa() {
        assertThrows(
                IllegalArgumentException.class,
                () -> tinhTuoi.calculateAge(1899)
        );
    }
}
