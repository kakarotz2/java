package Quan_ly_nhan_vien;

import java.util.Scanner;

public class Nhanvien {
    public int maNv;
    public String ten;
    public int namSinh;
    public double luong;

    public Nhanvien() {

    }

    Scanner scanner = new Scanner(System.in);

    public Nhanvien(int maNv, String ten, int namSinh, double luong) {
        super();
        this.maNv = maNv;
        this.ten = ten;
        this.namSinh = namSinh;
        this.luong = luong;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Họ Tên: " + this.ten + " Mã Nhân viên: " + this.maNv + " Năm sinh: " + this.namSinh + " Lương: "
                + this.luong;
    }

    public void inThongtin() {

    }
}
