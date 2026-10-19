/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.quanlysinhvien.model;

/**
 *
 * @author PC_33
 */
public class SinhVien {

    private String maSV;
    private String hoTen;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
