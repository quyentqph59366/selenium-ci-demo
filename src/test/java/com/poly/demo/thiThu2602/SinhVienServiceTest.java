package com.poly.demo.thiThu2602;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class SinhVienServiceTest {

    SinhVienService service;

    @BeforeEach
    void setup() {
        service = new SinhVienService();
        service.add(new SinhVien("SV01", "An", 20, 8.0f, 1, "CNTT"));
    }

    // TC1: Phân vùng hợp lệ
    @Test
    void testSua_HopLe() {
        service.sua("SV01", 9.0f);
    }

    // TC2: Biên dưới = 0
    @Test
    void testSua_BienDuoi() {
        service.sua("SV01", 0);
    }

    // TC3: Biên trên = 10
    @Test
    void testSua_BienTren() {
        service.sua("SV01", 10);
    }

    // TC4: Ngoài biên <0
    @Test
    void testSua_DiemAm() {
        assertThrows(IllegalArgumentException.class,
                () -> service.sua("SV01", -1));
    }

    // TC5: Ngoài biên >10
    @Test
    void testSua_DiemLonHon10() {
        assertThrows(IllegalArgumentException.class,
                () -> service.sua("SV01", 11));
    }

    // TC6: Mã SV rỗng
    @Test
    void testSua_MaRong() {
        assertThrows(IllegalArgumentException.class,
                () -> service.sua("", 8));
    }
}