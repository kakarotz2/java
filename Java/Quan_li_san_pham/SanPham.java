package Quan_li_san_pham;

public class SanPham {
	public String Tensp;
	public double Giasp;
	public String Hang;
	public Object xuatSp;

	public SanPham() {
	}

	public SanPham(String Tensp, double Giasp, String Hang) {
		this.Tensp = Tensp;
		this.Giasp = Giasp;
		this.Hang = Hang;
	}

	public String getTensp() {
		return Tensp;
	}

	public void setTensp(String tensp) {
		this.Tensp = tensp;
	}

	public double getGiasp() {
		return Giasp;
	}

	public void setGiasp(double giasp) {
		this.Giasp = giasp;
	}

	public String getHang() {
		return Hang;
	}

	public void setHang(String hang) {
		this.Hang = hang;
	}

	public void xuatSp() {
		System.out.println("   Tên sản phẩm: " + Tensp + "\t Giá sản phẩm: " + Giasp + "\t Hãng sản phẩm: " + Hang);
	}
}