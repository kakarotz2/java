package Quan_li_sinh_vien_1;

public class SinhVienIT extends SinhVienPoly {
    double diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hoTen, double diemJava, double diemCSS, double diemHTML) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    @Override
    public Double getDiem() {
        return ((2 * this.diemJava) + this.diemCSS + this.diemHTML) / 4;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\tHọ Tên: " + getHoTen() + "\n\tNgành: " + getNganh() + "\n\tĐiểm Java: "
                + diemJava + "    Điểm CSS: " + diemCSS + "    Điểm HTML: "
                + diemHTML + "   Học lực: " + getHocLuc() + "\n";
    }

}