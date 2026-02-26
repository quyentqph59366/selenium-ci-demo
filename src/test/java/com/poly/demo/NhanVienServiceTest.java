package com.poly.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    private NhanVienService service;

    @BeforeEach

    public void setUp() {
        service = new NhanVienService();


    }
    @Test
    public void themNhanVien_hopLe(){
        NhanVien nhanVien  = new NhanVien("NV01","nguyễn văn A",32,1000,"IT");
        assertTrue(service.themNhanVien(nhanVien));

    }
    @Test
    public void themNhanVien_hopLe_Luong1tr(){
        NhanVien nhanVien  = new NhanVien("NV002","Nguyễn Văn C",22,1_000_000,"marketing");
        assertTrue(service.themNhanVien(nhanVien));

    }
    @Test
    public void themNhanVien_khongHopLe_LuongAm5tr(){
        NhanVien nhanVien  = new NhanVien("NV003","Nhan Viên tên",28,1_000_000,"PB04");
//        assertThrows(IllegalArgumentException.class()->service.themNhanVien());

        assertThrows(IllegalArgumentException.class,()->service.themNhanVien(nhanVien));
    }
    @Test
    public void themNhanVien_khongHopLe_cacTruongTrong(){

        assertThrows(IllegalArgumentException.class,()->service.themNhanVien(null));
    }

    // TC1: Tuổi = 18 (biên dưới hợp lệ)
    @Test
    void testThemNhanVien_TuoiMin() {
        NhanVien nv = new NhanVien("NV01", "Nguyen Van A", 18, 5_000_000, "IT");
        assertTrue(service.themNhanVien(nv));
    }

    // TC2: Tuổi = 60 (biên trên hợp lệ)
    @Test
    void testThemNhanVien_TuoiMax() {
        NhanVien nv = new NhanVien("NV02", "Tran Van B", 60, 10_000_000, "HR");
        assertTrue(service.themNhanVien(nv));
    }

    // TC3: Tuổi < 18
    @Test
    void testThemNhanVien_TuoiNhoHon18() {
        NhanVien nv = new NhanVien("NV03", "Le Van C", 17, 8_000_000, "IT");
        assertThrows(IllegalArgumentException.class,
                () -> service.themNhanVien(nv));
    }

    // TC4: Lương = 0
    @Test
    void testThemNhanVien_LuongBang0() {
        NhanVien nv = new NhanVien("NV04", "Pham Van D", 25, 0, "IT");
        assertThrows(IllegalArgumentException.class,
                () -> service.themNhanVien(nv));
    }

    // TC5: Tên có ký tự đặc biệt
    @Test
    void testThemNhanVien_TenKyTuDacBiet() {
        NhanVien nv = new NhanVien("NV05", "Nguyen@Van", 30, 9_000_000, "IT");
        assertThrows(IllegalArgumentException.class,
                () -> service.themNhanVien(nv));
    }



    // TC1: Sửa hợp lệ
    @Test
    void testSuaNhanVien_HopLe() {
        NhanVien nv = new NhanVien("NV01", "Nguyen Van A", 25, 5_000_000, "IT");
        service.themNhanVien(nv);

        assertDoesNotThrow(() ->
                service.suaNhanVien(nv, "Nguyen Van B", 30, 8_000_000));
    }

    // TC2: Tên rỗng
    @Test
    void testSuaNhanVien_TenRong() {
        NhanVien nv = new NhanVien("NV02", "Le Van C", 28, 7_000_000, "HR");
        service.themNhanVien(nv);

        assertThrows(IllegalArgumentException.class,
                () -> service.suaNhanVien(nv, "", 30, 8_000_000));
    }

    // TC3: Tuổi < 18
    @Test
    void testSuaNhanVien_TuoiKhongHopLe() {
        NhanVien nv = new NhanVien("NV03", "Tran Van D", 30, 9_000_000, "IT");
        service.themNhanVien(nv);

        assertThrows(IllegalArgumentException.class,
                () -> service.suaNhanVien(nv, "Tran Van E", 17, 9_000_000));
    }

    // TC4: Lương > 100 triệu
    @Test
    void testSuaNhanVien_LuongQua100Tr() {
        NhanVien nv = new NhanVien("NV04", "Pham Van F", 35, 20_000_000, "HR");
        service.themNhanVien(nv);

        assertThrows(IllegalArgumentException.class,
                () -> service.suaNhanVien(nv, "Pham Van G", 35, 150_000_000));
    }

    // TC5: Tên có ký tự đặc biệt
    @Test
    void testSuaNhanVien_TenKyTuDacBiet() {
        NhanVien nv = new NhanVien("NV05", "Hoang Van H", 40, 12_000_000, "IT");
        service.themNhanVien(nv);

        assertThrows(IllegalArgumentException.class,
                () -> service.suaNhanVien(nv, "Hoang@Van", 40, 12_000_000));
    }








}