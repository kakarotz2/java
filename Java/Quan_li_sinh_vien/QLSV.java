package Quan_li_sinh_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<SinhVien> Sv = new ArrayList<SinhVien>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------~~~~~~Menu~~~~~~----------");
            System.out.println("\t1. Nhập sinh viên hoặc danh sách sinh viên");
            System.out.println("\t2. Xuất sinh viên hoặc danh sách sinh viên");
            System.out.println("\t3. Danh sách sinh viên qua môn");
            System.out.println("\t4. Tìm sinh viên qua mã sinh viên");
            System.out.println("\t5. Xuât danh sách sinh viên giảm dần theo điểm");
            System.out.println("\t0. Nhấn 0 để thoát");
            System.out.println("----------~~~~~~Chọn đi~~~~~~----------");

            int key = sc.nextInt();
            System.out.println("----------------------------------------");
            switch (key) {
                case 1:
                    nhapSv();
                    break;
                case 2:
                    xuatSv();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("\t\tGood Bye!");
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai lua chon cua ban!");
            }
        }
    }

    // 1. nhập sinh viên or danh sách sinh viên
    public static void nhapSv() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            SinhVien sv = new SinhVien();
            System.out.print("\n   Nhập tên sinh viên: ");
            sv.ten = sc.nextLine();
            System.out.print("   Nhập mã sinh viên: ");
            sv.maSV = sc.nextInt();
            System.out.print("   Nhập năm sinh: ");
            sv.namSinh = sc.nextInt();
            System.out.print("   Nhập điểm java: ");
            sv.diemJava = sc.nextDouble();
            Sv.add(sv);
            sc.nextLine();
            System.out.println("\n   Bạn có muốn nhập sinh viên viên nữa không?");
            System.out.print("   Nhấn phím bất kì để nhập thêm 'N' để thoat: ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    // 2. xuất sinh viên or danh sách sinh viên
    public static void xuatSv() {
        System.out.println("\t\t Danh sách sản phẩm: ");
        for (SinhVien sv : Sv) {
            System.out.println("   Tên sinh viên: " + sv.ten + "\t Mã sinh viên: " + sv.maSV + "\t Năm sinh: "
                    + sv.namSinh + "\t Điểm Java: " + sv.diemJava);
        }
    }
    // 4. tìm sinh viên theo mã sinh viên

}
