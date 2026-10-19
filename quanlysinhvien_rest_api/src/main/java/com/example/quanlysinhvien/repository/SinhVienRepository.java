/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlysinhvien.repository;

import com.example.quanlysinhvien.model.SinhVien;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class SinhVienRepository {

    private final List<SinhVien> danhSach = new ArrayList<>();
// Khởi tạo dữ liệu mẫu

    public SinhVienRepository() {
        danhSach.add(new SinhVien(
                "SV001", "Nguyễn Văn An", "an@example.com"));
        danhSach.add(new SinhVien(
                "SV002", "Trần Thị Bình", "binh@example.com"));
        danhSach.add(new SinhVien(
                "SV003", "Lê Văn Cương", "cuong@example.com"));
    }
// 1. Lấy danh sách sinh viên

    public List<SinhVien> findAll() {
        return danhSach;
    }
// 2. Tìm sinh viên theo mã

    public SinhVien findByMaSV(String maSV) {
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }
// 3. Kiểm tra mã sinh viên đã tồn tại

    public boolean existsByMaSV(String maSV) {
        return findByMaSV(maSV) != null;
    }
// 4. Thêm sinh viên

    public void save(SinhVien sv) {
        danhSach.add(sv);
    }
// 5. Xóa sinh viên

    public boolean deleteByMaSV(String maSV) {
        SinhVien sv = findByMaSV(maSV);
        if (sv != null) {
            danhSach.remove(sv);

            return true;
        }
        return false;
    }
}
