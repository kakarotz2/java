package Quan_li_sinh_vien_1;

public abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract Double getDiem();

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getHocLuc() {
        String hocLuc;
        if (getDiem() < 3) {
            hocLuc = "Yếu";
        } else if (getDiem() < 5) {
            hocLuc = "Kém";
        } else if (getDiem() < 6) {
            hocLuc = "Trung bình";
        } else if (getDiem() < 8) {
            hocLuc = "Khá";
        } else {
            hocLuc = "Giỏi";
        }
        return hocLuc;
    }

    public void xuat() {
        System.out.println("Ho va Ten: " + this.hoTen + " Nganh: " + this.nganh + "Điểm: " + getDiem() + "Học lực: "
                + getHocLuc());
    }

}