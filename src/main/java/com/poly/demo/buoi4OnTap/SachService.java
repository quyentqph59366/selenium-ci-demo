package com.poly.demo.buoi4OnTap;

import java.util.ArrayList;
import java.util.List;

public class SachService {

    private List<Sach> danhSach = new ArrayList<>();

    // Thêm sách
    public void them(Sach sach) {
        if (sach.getTen() == null || sach.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sách không được để trống");
        }

        if (sach.getSoTrang() < 1 || sach.getSoTrang() > 50) {
            throw new IllegalArgumentException("Số trang phải từ 1 đến 50");
        }

        danhSach.add(sach);
    }

    // Sửa sách theo id
    public void sua(String id, Sach sachMoi) {
        if (sachMoi.getTen() == null || sachMoi.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sách không được để trống");
        }

        if (sachMoi.getSoTrang() < 1 || sachMoi.getSoTrang() > 50) {
            throw new IllegalArgumentException("Số trang phải từ 1 đến 50");
        }

        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getId().equals(id)) {
                danhSach.set(i, sachMoi);
                return;
            }
        }
        throw new IllegalArgumentException("Không tìm thấy sách");
    }

    public List<Sach> getDanhSach() {
        return danhSach;
    }
}

