package Quan_li_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai3 {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<SanPham> SP = new ArrayList<SanPham>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("----------~~~~~~Menu~~~~~~----------");
            System.out.println("\t1. Nhập sản phẩm");
            System.out.println("\t2. Xuất sản phẩm");
            System.out.println("\t3. Sắp xếp sản phẩm theo tên");
            System.out.println("\t4. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("\t5. Xuât giá trung bình của sản phẩm");
            System.out.println("\t6. Tìm sản phẩm theo hãng");
            System.out.println("\t7. Xóa sản phẩm theo tên");
            System.out.println("\t8. Nhấn 8 để thoát");
            System.out.println("----------~~~~~~Chọn đi~~~~~~----------");

            int key = sc.nextInt();
            System.out.println("----------------------------------------");
            switch (key) {
                case 1:
                    nhapSP();
                    break;
                case 2:
                    xuatSp();
                    break;
                case 3:
                    sapXep_theoten();
                    break;
                case 4:
                    sapXep_theogia();
                    break;
                case 5:
                    tB();
                    break;
                case 6:
                    search_sp();
                    break;
                case 7:
                    remove();
                    break;
                case 8:
                    System.out.println("\t\tGood Bye!");
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai lua chon cua ban!");
            }
        }
    }

    public static void nhapSP() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            SanPham sp = new SanPham();
            System.out.print("\n   Nhập tên sản phẩm: ");
            sp.Tensp = sc.nextLine();
            System.out.print("   Nhập giá sp: ");
            sp.Giasp = sc.nextDouble();
            sc.nextLine();
            System.out.print("   Nhập hãng sản phẩm: ");
            sp.Hang = sc.nextLine();
            SP.add(sp);
            System.out.print("\n   Nhấn phím bất kì để nhập thêm '0' để thoat: ");
            if (sc.nextLine().equalsIgnoreCase("0")) {
                break;
            }
        }
    }

    // 2 .xuat danh sach san pham
    public static void xuatSp() {
        System.out.println("\t\t Danh sách sản phẩm: ");
        for (SanPham sp : SP) {
            System.out.println(
                    "   Tên sản phẩm: " + sp.Tensp + "\t Giá sản phẩm: " + sp.Giasp + "\t Hãng sản phẩm: " + sp.Hang);
        }
    }

    // 3. sap xep danh sach theo ten
    public static void sapXep_theoten() {
        Collections.sort(SP, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getTensp().compareTo(o2.getTensp());
            }
        });
        System.out.println("\t\t Danh sách sau khi sắp xếp theo tên là: ");
        for (SanPham sp : SP) {
            System.out.println(
                    "   Tên sản phẩm: " + sp.Tensp + "\t Giá sản phẩm: " + sp.Giasp + "\t Hãng sản phẩm: " + sp.Hang);
        }
    }

    // 4. sap xep theo gia giam dan
    public static void sapXep_theogia() {
        Collections.sort(SP, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return (int) ((int) o1.Giasp - o2.Giasp);
            }
        });
        System.out.println("\t\tDanh sách sau sắp xếp khi giảm dần theo giá: ");
        for (SanPham sp : SP) {
            System.out.println(
                    "   Tên sản phẩm: " + sp.Tensp + "\t Giá sản phẩm: " + sp.Giasp + "\t Hãng sản phẩm: " + sp.Hang);
        }
    }

    // 5. xuat gia trung binh cua san pham
    public static void tB() {
        double tb = 0, sum = 0;
        for (SanPham sanpham : SP) {
            sum += sanpham.getGiasp();
        }
        tb = sum / SP.size();
        System.out.println("   Giá trung bình của các sản phẩm là: " + tb);
    }

    // 6. tim san pham theo hang
    public static void search_sp() {
        Scanner sc = new Scanner(System.in);
        SanPham founts = null;
        System.out.print("   Nhập hãng sản phẩm mà bạn muốn tìm kiếm: ");
        String check = sc.nextLine();
        for (SanPham sanPham : SP) {
            if (sanPham.getHang().equalsIgnoreCase(check)) {
                founts = sanPham;
                break;
            }
        }
        if (founts != null) {
            System.out.println("\n\t\tHãng " + check + " bạn muốn tìm kiếm");
            founts.xuatSp();
        } else {
            System.out.println("   Sản phẩm " + check + " không tìm thấy!");
        }
    }

    // 7. Xoa san pham
    public static void remove() {
        Scanner sc = new Scanner(System.in);
        SanPham found = null;
        System.out.print("   Nhập tên sản phẩm cần xóa: ");
        String a = sc.nextLine();
        for (SanPham sanpham : SP) {
            if (sanpham.getTensp().equals(a)) {
                found = sanpham;
                break;
            }
        }
        if (found != null) {
            SP.remove(found);
            System.out.println("\n   Sản phẩm " + "'" + a + "'" + " đã xóa\n");
            System.out.println("   Lựa chọn 2 để update lại danh sách sản phẩm");
        } else {
            System.out.println("   Sản phẩm " + "'" + a + "'" + " không tìm thấy");
        }
    }
}
