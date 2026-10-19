/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlysinhvien.controller;

import com.example.quanlysinhvien.model.SinhVien;
import com.example.quanlysinhvien.repository.SinhVienRepository;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sinhvien")
public class SinhVienController {
private final SinhVienRepository repository;
// Tiêm phụ thuộc Repository qua constructor
public SinhVienController(SinhVienRepository repository) {
this.repository = repository;
}
// 1. Xem danh sách sinh viên
@GetMapping
public ResponseEntity<List<SinhVien>> layDanhSach() {
return ResponseEntity.ok(repository.findAll());
}
// 2. Tìm sinh viên theo mã
@GetMapping("/{maSV}")
public ResponseEntity<?> timTheoMa(@PathVariable String maSV) {
SinhVien sv = repository.findByMaSV(maSV);
if (sv == null) {
return ResponseEntity.status(HttpStatus.NOT_FOUND)
.body("Không tìm thấy sinh viên");
}
return ResponseEntity.ok(sv);

}
// 3. Thêm sinh viên
@PostMapping
public ResponseEntity<?> themSinhVien(
@RequestBody SinhVien sv) {
// Kiểm tra dữ liệu đầu vào
if (sv.getMaSV() == null
|| sv.getMaSV().trim().isEmpty()
|| sv.getHoTen() == null
|| sv.getHoTen().trim().isEmpty()
|| sv.getEmail() == null
|| sv.getEmail().trim().isEmpty()) {
return ResponseEntity.badRequest()
.body("Mã sinh viên, họ tên và email không được để trống");
}
// Kiểm tra mã sinh viên đã tồn tại
if (repository.existsByMaSV(sv.getMaSV())) {
return ResponseEntity.status(HttpStatus.CONFLICT)
.body("Mã sinh viên đã tồn tại");
}
repository.save(sv);
return ResponseEntity.status(HttpStatus.CREATED)
.body(sv);
}
// 4. Cập nhật sinh viên
@PutMapping("/{maSV}")
public ResponseEntity<?> capNhatSinhVien(
@PathVariable String maSV,
@RequestBody SinhVien svMoi) {
// Kiểm tra dữ liệu đầu vào
if (svMoi.getHoTen() == null
|| svMoi.getHoTen().trim().isEmpty()
|| svMoi.getEmail() == null
|| svMoi.getEmail().trim().isEmpty()) {
return ResponseEntity.badRequest()
.body("Họ tên và email không được để trống");
}
SinhVien sv = repository.findByMaSV(maSV);
if (sv == null) {
return ResponseEntity.status(HttpStatus.NOT_FOUND)
.body("Không tìm thấy sinh viên");
}

sv.setHoTen(svMoi.getHoTen());
sv.setEmail(svMoi.getEmail());
return ResponseEntity.ok(sv);
}
// 5. Xóa sinh viên
@DeleteMapping("/{maSV}")
public ResponseEntity<?> xoaSinhVien(
@PathVariable String maSV) {
boolean daXoa = repository.deleteByMaSV(maSV);
if (!daXoa) {
return ResponseEntity.status(HttpStatus.NOT_FOUND)
.body("Không tìm thấy sinh viên");
}
return ResponseEntity.noContent().build();
}
}