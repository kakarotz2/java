package Quan_li_sinh_vien_1;

public class SinhVienBiz extends SinhVienPoly {
    double diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "BIZ");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public Double getDiem() {
        return ((2 * this.diemMarketing) + this.diemSales) / 3;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\tHọ Tên: " + getHoTen() + "\n\tNgành: " + getNganh() + "\n\tĐiểm Marketing: "
                + diemMarketing + "    Điểm Sales: " + diemSales
                + "   Học lực: " + getHocLuc() + "\n";
    }
}