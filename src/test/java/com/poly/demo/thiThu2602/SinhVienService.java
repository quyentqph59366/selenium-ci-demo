package com.poly.demo.thiThu2602;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> list = new ArrayList<>();

    public void add(SinhVien sv) {
        list.add(sv);
    }

    public void sua(String maSV, float diemMoi) {

        if (maSV == null || maSV.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã SV không được trống");
        }

        if (diemMoi < 0 || diemMoi > 10) {
            throw new IllegalArgumentException("Điểm phải từ 0-10");
        }

        for (SinhVien sv : list) {
            if (sv.getMaSV().equals(maSV)) {
                sv.setDiemTrungBinh(diemMoi);
                return;
            }
        }

        throw new IllegalArgumentException("Không tìm thấy sinh viên");
    }
}
