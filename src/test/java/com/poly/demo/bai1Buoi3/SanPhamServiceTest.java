package com.poly.demo.bai1Buoi3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {

    private SanPhamService service;

    @BeforeEach
    void setUp() {
        service = new SanPhamService();
    }


    // TC1: Số lượng = 1 (biên dưới hợp lệ)

    
    @Test
    void testThem_SoLuongMin() {
        SanPham sp = new SanPham("1", "SP01", "Ao", 1_000_000, "Do", "M", 1);
        assertDoesNotThrow(() -> service.them(sp));
    }

    // TC2: Số lượng = 99 (biên trên hợp lệ)
    @Test
    void testThem_SoLuongMax() {
        SanPham sp = new SanPham("2", "SP02", "Quan", 1_500_000, "Den", "L", 99);
        assertDoesNotThrow(() -> service.them(sp));
    }

    // TC3: Số lượng = 0 (không hợp lệ)
    @Test
    void testThem_SoLuongBang0() {
        SanPham sp = new SanPham("3", "SP03", "Giay", 2_000_000, "Trang", "42", 0);
        assertThrows(IllegalArgumentException.class, () -> service.them(sp));
    }

    // TC4: Số lượng = 100 (không hợp lệ)
    @Test
    void testThem_SoLuongBang100() {
        SanPham sp = new SanPham("4", "SP04", "Mu", 500_000, "Xanh", "Free", 100);
        assertThrows(IllegalArgumentException.class, () -> service.them(sp));
    }

    // TC5: Mã không bắt đầu bằng SP
    @Test
    void testThem_MaKhongHopLe() {
        SanPham sp = new SanPham("5", "AB01", "Tui", 800_000, "Den", "M", 10);
        assertThrows(IllegalArgumentException.class, () -> service.them(sp));
    }

    // SỬA

    // TC1: Giá = 500.000 (biên dưới hợp lệ)
    @Test
    void testSua_GiaMin() {
        SanPham sp = new SanPham("1", "SP01", "Ao", 1_000_000, "Do", "M", 10);
        service.them(sp);

        assertDoesNotThrow(() -> service.sua(sp, 500_000));
    }

    // TC2: Giá = 5.000.000 (biên trên hợp lệ)
    @Test
    void testSua_GiaMax() {
        SanPham sp = new SanPham("2", "SP02", "Quan", 2_000_000, "Den", "L", 20);
        service.them(sp);

        assertDoesNotThrow(() -> service.sua(sp, 5_000_000));
    }

    // TC3: Giá < 500.000
    @Test
    void testSua_GiaNhoHonMin() {
        SanPham sp = new SanPham("3", "SP03", "Giay", 1_000_000, "Trang", "42", 5);
        service.them(sp);

        assertThrows(IllegalArgumentException.class,
                () -> service.sua(sp, 400_000));
    }

    // TC4: Giá > 5.000.000
    @Test
    void testSua_GiaLonHonMax() {
        SanPham sp = new SanPham("4", "SP04", "Mu", 1_000_000, "Xanh", "Free", 3);
        service.them(sp);

        assertThrows(IllegalArgumentException.class,
                () -> service.sua(sp, 6_000_000));
    }

    // TC5: Giá âm (đoán lỗi thường gặp)
    @Test
    void testSua_GiaAm() {
        SanPham sp = new SanPham("5", "SP05", "Tui", 1_000_000, "Den", "M", 8);
        service.them(sp);

        assertThrows(IllegalArgumentException.class,
                () -> service.sua(sp, -1_000_000));
    }

}