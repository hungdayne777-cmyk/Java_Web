/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlysach.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "SACH", schema = "dbo")
public class Sach {

    @Id
    @Column(name = "MaSach", length = 10)
    private String maSach;
    @Column(name = "TenSach", nullable = false, length = 200)
    private String tenSach;
    @Column(name = "TacGia", nullable = false, length = 100)
    private String tacGia;
    @Column(name = "NamXuatBan")
    private Integer namXuatBan;
    @Column(name = "DonGia", precision = 12, scale = 2)
    private BigDecimal donGia;
    @Column(name = "SoLuong", nullable = false)
    private Integer soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia,
            Integer namXuatBan, BigDecimal donGia, Integer soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public Integer getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(Integer namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}




