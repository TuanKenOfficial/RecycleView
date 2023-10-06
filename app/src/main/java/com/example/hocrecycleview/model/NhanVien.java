package com.example.hocrecycleview.model;

public class NhanVien {
    private int manv;
    private String ten;
    private String address;
    private String phone;
    private String biensoxe;

    public NhanVien() {
    }

    public NhanVien(int manv, String ten, String address, String phone, String biensoxe) {
        this.manv = manv;
        this.ten = ten;
        this.address = address;
        this.phone = phone;
        this.biensoxe = biensoxe;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBiensoxe() {
        return biensoxe;
    }

    public void setBiensoxe(String biensoxe) {
        this.biensoxe = biensoxe;
    }
}
