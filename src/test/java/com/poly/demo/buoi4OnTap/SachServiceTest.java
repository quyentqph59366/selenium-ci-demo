package com.poly.demo.buoi4OnTap;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {

    private SachService service;

    @BeforeEach
    void setUp() {
        service = new SachService();
    }

    // ===== TEST CHỨC NĂNG THÊM =====

    // TC1: số trang = 1 (biên dưới hợp lệ)
    @Test
    void testThemSoTrangBang1() {
        Sach s = new Sach("1", "Java", 1, "Nguyen Van A", 1);
        assertDoesNotThrow(() -> service.them(s));
    }

    // TC2: số trang = 50 (biên trên hợp lệ)
    @Test
    void testThemSoTrangBang50() {
        Sach s = new Sach("2", "Spring Boot", 50, "Nguyen Van B", 1);
        assertDoesNotThrow(() -> service.them(s));
    }

    // TC3: số trang = 0 (không hợp lệ)
    @Test
    void testThemSoTrangBang0() {
        Sach s = new Sach("3", "JUnit", 0, "Nguyen Van C", 1);
        assertThrows(IllegalArgumentException.class, () -> service.them(s));
    }

    // TC4: số trang = 51 (không hợp lệ)
    @Test
    void testThemSoTrangBang51() {
        Sach s = new Sach("4", "Testing", 51, "Nguyen Van D", 1);
        assertThrows(IllegalArgumentException.class, () -> service.them(s));
    }

    // TC5: tên sách rỗng
    @Test
    void testThemTenSachRong() {
        Sach s = new Sach("5", "", 20, "Nguyen Van E", 1);
        assertThrows(IllegalArgumentException.class, () -> service.them(s));
    }

    // ===== TEST CHỨC NĂNG SỬA =====

    // TC6: sửa hợp lệ
    @Test
    void testSuaHopLe() {
        Sach s1 = new Sach("6", "C++", 10, "A", 1);
        service.them(s1);

        Sach sMoi = new Sach("6", "C++ Nang Cao", 20, "A", 2);
        assertDoesNotThrow(() -> service.sua("6", sMoi));
    }

    // TC7: sửa số trang không hợp lệ
    @Test
    void testSuaSoTrangKhongHopLe() {
        Sach s1 = new Sach("7", "Python", 10, "B", 1);
        service.them(s1);

        Sach sMoi = new Sach("7", "Python", 100, "B", 1);
        assertThrows(IllegalArgumentException.class, () -> service.sua("7", sMoi));
    }

    // TC8: sửa tên sách rỗng
    @Test
    void testSuaTenSachRong() {
        Sach s1 = new Sach("8", "HTML", 15, "C", 1);
        service.them(s1);

        Sach sMoi = new Sach("8", "", 15, "C", 1);
        assertThrows(IllegalArgumentException.class, () -> service.sua("8", sMoi));
    }
}
