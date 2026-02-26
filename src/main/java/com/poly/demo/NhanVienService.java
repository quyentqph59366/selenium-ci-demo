package com.poly.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NhanVienService {

    private List<NhanVien> dsNhanVien = new ArrayList<>();

    // chỉ cho chữ + khoảng trắng
    private static final String TEN_REGEX = "^[a-zA-ZÀ-ỹ\\s]+$";

    public boolean themNhanVien(NhanVien nv) {

        if (nv == null) {
            throw new IllegalArgumentException("NhanVien không được để trống");
        }

        if (nv.getMaNV().isEmpty() || nv.getTenNV().isEmpty()
                || nv.getPhongBan().isEmpty()) {
            throw new IllegalArgumentException("Tất cả các trường không để trống");
        }

        if (!Pattern.matches(TEN_REGEX, nv.getTenNV())) {
            throw new IllegalArgumentException("Tên không được chứa ký tự đặc biệt");
        }

        if (nv.getTuoi() < 18 || nv.getTuoi() > 60) {
            throw new IllegalArgumentException("Tuổi phải từ 18 đến 60");
        }

        if (nv.getLuong() <= 0 || nv.getLuong() > 100_000_000) {
            throw new IllegalArgumentException("Lương phải > 0 và ≤ 100 triệu");
        }

        dsNhanVien.add(nv);
        return true;
    }

    // Tìm theo phòng ban
    public List<NhanVien> timTheoPhongBan(String phongBan) {
        return dsNhanVien.stream()
                .filter(nv -> nv.getPhongBan().equalsIgnoreCase(phongBan))
                .collect(Collectors.toList());
    }

    // Sửa nhân viên
    public void suaNhanVien(NhanVien nv, String tenMoi, int tuoiMoi, double luongMoi) {

        if (tenMoi == null || tenMoi.isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống");
        }

        if (!Pattern.matches(TEN_REGEX, tenMoi)) {
            throw new IllegalArgumentException("Tên không hợp lệ");
        }

        if (tuoiMoi < 18 || tuoiMoi > 60) {
            throw new IllegalArgumentException("Tuổi không hợp lệ");
        }

        if (luongMoi <= 0 || luongMoi > 100_000_000) {
            throw new IllegalArgumentException("Lương không hợp lệ");
        }

        nv.setTenNV(tenMoi);
        nv.setTuoi(tuoiMoi);
        nv.setLuong(luongMoi);
    }
}
