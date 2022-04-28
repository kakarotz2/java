package Quan_li_sinh_vien_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVienPoly> SinhVien = new ArrayList<SinhVienPoly>();

    public static void main(String[] args) {
        while (true) {
            menu();
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    SVGioi();
                    break;
                case 4:
                    SapXep();
                    break;
                case 5:
                    System.out.println("\t\tGood Bye!");
                    System.out.println("----------------------------------------------------------------");
                    System.exit(5);
                default:
                    System.out.println("Vui lòng nhập lại lựa chọn của bạn!");
            }
        }
    }

    public static void menu() {
        System.out.println("-----------~~~MENU~~~-------------------------------------------");
        System.out.println("\t1. Nhập danh sách sinh viên");
        System.out.println("\t2. Xuất danh sách sinh viên");
        System.out.println("\t3. Xuất danh sách sinh viên có học lực giỏi");
        System.out.println("\t4. Sắp xếp danh sách sinh viên theo điểm");
        System.out.println("\t5. Kết thúc");
        System.out.println("----------------------------------------------------------------");

    }

    public static void Nhap() {
        System.out.print("\tNhập số lượng sinh viên: ");
        int sl = sc.nextInt();
        for (int i = 0; i < sl; i++) {
            System.out.print("\tChọn sinh viên cần thêm '1' sinh viên IT '2' sinh viên Biz: ");
            int chon = sc.nextInt();
            sc.nextLine();
            if (chon == 1) {
                String hoTen;
                double diemJava, diemCSS, diemHTML;
                System.out.print("\n\tNhập Họ và tên sinh viên IT: ");
                hoTen = sc.nextLine();
                System.out.print("\tNhập điểm Java: ");
                diemJava = sc.nextDouble();
                System.out.print("\tNhập điểm CSS: ");
                diemCSS = sc.nextDouble();
                System.out.print("\tNhập điểm HTML: ");
                diemHTML = sc.nextDouble();
                System.out.println("\n");
                SinhVienIT IT = new SinhVienIT(hoTen, diemJava, diemCSS, diemHTML);
                SinhVien.add(IT);
            } else if (chon == 2) {
                String hoTen;
                double diemMarketing, diemSales;
                System.out.print("\tNhập Họ và tên sinh viên Biz: ");
                hoTen = sc.nextLine();
                System.out.print("\tNhập điểm Marketing: ");
                diemMarketing = sc.nextDouble();
                System.out.print("\tNhập điểm Sales: ");
                diemSales = sc.nextDouble();
                SinhVienBiz biz = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                SinhVien.add(biz);
            } else {
                System.out.println("\tChọn sai vui lòng chọn lại!!!");
                break;
            }
        }

    }

    public static void Xuat() {
        for (SinhVienPoly sinhVienPoly : SinhVien) {
            System.out.println(sinhVienPoly.toString());
        }
    }

    public static void SVGioi() {
        for (SinhVienPoly sinhVienPoly : SinhVien) {
            if (sinhVienPoly.getHocLuc().equalsIgnoreCase("giỏi")) {
                System.out.println(sinhVienPoly.toString());
            }
        }
    }

    public static void SapXep() {
        Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {

            @Override
            public int compare(SinhVienPoly o1, SinhVienPoly o2) {
                // TODO Auto-generated method stub
                return o2.getDiem().compareTo(o1.getDiem());
            }
        };
        Collections.sort(SinhVien, comp);
        Xuat();
    }
}
