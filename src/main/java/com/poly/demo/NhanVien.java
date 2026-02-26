package com.poly.demo;

public class NhanVien {

//    maNV – String, tenNV – String, tuoi – int, luong – double, phongBan – String

    private String maNV;

    private String tenNV;

    private int tuoi;

    private double luong;


    private String phongBan;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, int tuoi, double luong, String phongBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.luong = luong;
        this.phongBan = phongBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
}
