package com.poly.demo.bai1Buoi3;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    private List<SanPham> danhSach = new ArrayList<>();

    // THÊM
    public void them(SanPham sp) {

        if (sp.getSoLuong() <= 0 || sp.getSoLuong() >= 100) {
            throw new IllegalArgumentException("Số lượng phải > 0 và < 100");
        }

        if (!sp.getMaSanPham().startsWith("SP")) {
            throw new IllegalArgumentException("Mã sản phẩm phải bắt đầu bằng SP");
        }

        for (SanPham s : danhSach) {
            if (s.getMaSanPham().equals(sp.getMaSanPham())) {
                throw new IllegalArgumentException("Mã sản phẩm phải là duy nhất");
            }
        }

        danhSach.add(sp);
    }

    // SỬA
    public void sua(SanPham sp, float giaMoi) {

        if (giaMoi < 500_000 || giaMoi > 5_000_000) {
            throw new IllegalArgumentException("Giá phải từ 500.000 đến 5.000.000");
        }

        sp.setGia(giaMoi);
    }

    // XÓA
    public void xoa(String maSP) {
        danhSach.removeIf(sp -> sp.getMaSanPham().equals(maSP));
    }

    public List<SanPham> getDanhSach() {
        return danhSach;
    }
}
