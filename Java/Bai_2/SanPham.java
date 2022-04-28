package Bai_2;

public class SanPham {
    public static final String setHang = null;
    private float Gia;
    private String TenSanPham;
    private String Hang;

    public SanPham() {

    }

    public SanPham(float Gia, String TenSanPham, String Hang) {
        this.Gia = Gia;
        this.TenSanPham = TenSanPham;
        this.Hang = Hang;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    @Override
    public String toString() {
        return "San Pham{" + "Ten san pham=" + TenSanPham + ", Gia='" + Gia + ' ' + ", Hang='" + Hang + ' ' + '}';
    }

    public void hienThiTT() {
        System.out.printf("%-5d %-20s %-15s\n", TenSanPham, Gia, Hang);
    }
}