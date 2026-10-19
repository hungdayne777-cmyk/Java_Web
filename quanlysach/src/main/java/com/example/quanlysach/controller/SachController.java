/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlysach.controller;

import com.example.quanlysach.model.Sach;
import com.example.quanlysach.repository.SachRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/sach")
public class SachController {
private final SachRepository repository;
public SachController(SachRepository repository) {
this.repository = repository;
}

// 1. Lay danh sach sach
@GetMapping
public List<Sach> getAll() {
return repository.findAll();
}
// 2. Tim sach theo ma
@GetMapping("/{maSach}")
public ResponseEntity<Sach> getById(@PathVariable String maSach) {
Optional<Sach> ketQua = repository.findById(maSach);
if (ketQua.isPresent()) {
return ResponseEntity.ok(ketQua.get());
}
return ResponseEntity.notFound().build();
}
// 3. Them sach
@PostMapping
public ResponseEntity<Sach> create(@RequestBody Sach sach) {
if (sach.getMaSach() == null || sach.getMaSach().isBlank()
|| sach.getTenSach() == null || sach.getTenSach().isBlank()
|| sach.getTacGia() == null || sach.getTacGia().isBlank()) {
return ResponseEntity.badRequest().build();
}
if (repository.existsById(sach.getMaSach())) {
return ResponseEntity.status(HttpStatus.CONFLICT).build();
}
Sach daLuu = repository.save(sach);
return ResponseEntity.status(HttpStatus.CREATED).body(daLuu);
}
// 4. Cap nhat sach
@PutMapping("/{maSach}")
public ResponseEntity<Sach> update(
@PathVariable String maSach, @RequestBody Sach data) {
Optional<Sach> ketQua = repository.findById(maSach);
if (ketQua.isEmpty()) {
return ResponseEntity.notFound().build();
}
if (data.getTenSach() == null || data.getTenSach().isBlank()
|| data.getTacGia() == null || data.getTacGia().isBlank()) {
return ResponseEntity.badRequest().build();
}
Sach sach = ketQua.get();
sach.setTenSach(data.getTenSach());
sach.setTacGia(data.getTacGia());
sach.setNamXuatBan(data.getNamXuatBan());
sach.setDonGia(data.getDonGia());
sach.setSoLuong(data.getSoLuong());
Sach daCapNhat = repository.save(sach);

return ResponseEntity.ok(daCapNhat);
}
// 5. Xoa sach
@DeleteMapping("/{maSach}")
public ResponseEntity<Void> delete(@PathVariable String maSach) {
if (!repository.existsById(maSach)) {
return ResponseEntity.notFound().build();
}
repository.deleteById(maSach);
return ResponseEntity.noContent().build();
}
// 6. Tim sach theo ten
@GetMapping("/search")
public List<Sach> searchByTen(@RequestParam String tenSach) {
return repository.findByTenSachContainingIgnoreCase(tenSach);
}
// 7. Tim sach theo tac gia
@GetMapping("/search/tacgia")
public List<Sach> searchByTacGia(@RequestParam String tacGia) {
return repository.findByTacGiaContainingIgnoreCase(tacGia);
}
// 8. Tim sach theo muc gia toi da
@GetMapping("/search/dongia")
public List<Sach> searchByDonGia(@RequestParam BigDecimal max) {
return repository.findByDonGiaLessThanEqual(max);
}
}