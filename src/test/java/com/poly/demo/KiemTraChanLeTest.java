package com.poly.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KiemTraChanLeTest {

    private KiemTraChanLe kiemTra;

    @BeforeEach
    void setUp() {
        kiemTra = new KiemTraChanLe();
    }

    // ===== PHÂN VÙNG TƯƠNG ĐƯƠNG =====

    @Test
    void kiemTraSoChan() {
        assertTrue(kiemTra.laSoChan(4));
    }

    @Test
    void kiemTraSoLe() {
        assertFalse(kiemTra.laSoChan(5));
    }

    // ===== KIỂM THỬ BIÊN =====

    @Test
    void kiemTraSoKhong() {
        assertTrue(kiemTra.laSoChan(0));
    }

    @Test
    void kiemTraSoLeNhoNhat() {
        assertFalse(kiemTra.laSoChan(1));
    }

    // ===== NGOẠI LỆ =====

    @Test
    void kiemTraSoAm() {
        assertThrows(
                IllegalArgumentException.class,
                () -> kiemTra.laSoChan(-1)
        );
    }
}
