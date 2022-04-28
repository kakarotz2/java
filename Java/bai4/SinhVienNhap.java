package bai4;

public class SinhVienNhap {
    private String tenSv;
    private double diemTb;
    public SinhVienNhap() {

    }
    public SinhVienNhap(String tenSv, double diemTb) {

        this.tenSv = tenSv;
        this.diemTb = diemTb;
    }
 
    public String gettenSv() {
        return tenSv;
    }
 
    public void settenSv(String tenSv) {
        this.tenSv = tenSv;
    }
    public double getdiemTb(){ 
        return diemTb;
    }
    public void setdiemTb(double diemTb) {
        this.diemTb = diemTb;
    }
    @Override
    public String toString() {
        return "SinhVienNhap{hoten='" + tenSv + ' ' + "Diem trung binh" + diemTb + "}";
    }
    public void hienThiTT() {
        System.out.printf("%-5d %-20s \n", tenSv, diemTb);
    }

}