package Quan_li_sinh_vien;

public class SinhVien {
    int maSV;
    String ten;
    int namSinh;
    double diemJava;

    // khởi tạo constructor mặc định
    public SinhVien() {

    }

    // khởi tạo constructor có tham số
    public SinhVien(int maSV, String ten, int namSinh, double diemJava) {
        this.maSV = maSV;
        this.ten = ten;
        this.namSinh = namSinh;
        this.diemJava = diemJava;
    }

    // getter va setter
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
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

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    /// khởi tạo phương thức toString
    @Override
    public String toString() {
        return "SinhVienNhap{" + "Ho va ten" + ten + ", Ma sinh vien'" + maSV + " Nam sinh" + namSinh + " Diem Java "
                + diemJava;
    }

    // khởi tạo phương thức hiển thị theo format
    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s %-15s \n", maSV, ten, namSinh, diemJava);
    }

    public void xuatSv() {
        System.out.println("   Tên sinh viên: " + ten + "\t Mã sinh viên: " + maSV + "\t Năm sinh: " + namSinh
                + "\t Điểm Java: " + diemJava);
    }
}
