package Quan_ly_nhan_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {
    public static ArrayList<Nhanvien> Nv = new ArrayList<Nhanvien>();

    // 1. Nhập nhân viên
    public static void nhapNv() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            Nhanvien nv = new Nhanvien();
            System.out.print("\n   Nhập tên NV: ");
            nv.ten = sc.nextLine();
            System.out.print("   Nhập mã NV: ");
            nv.maNv = sc.nextInt();
            System.out.print("   Nhập năm sinh: ");
            nv.namSinh = sc.nextInt();
            System.out.print("   Nhập lương: ");
            nv.luong = sc.nextDouble();
            Nv.add(nv);
            sc.nextLine();
            System.out.println("\n   Bạn có muốn nhập nhân viên nữa không?");
            System.out.print("   Nhấn phím bất kì để nhập thêm 'N' để thoat: ");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    // 2. Xuất nhân viên
    public static void xuatNv() {
        System.out.println("\t\t Danh sách Nhân Viên: ");
        for (Nhanvien nv : Nv) {
            System.out.println("   Tên Nv: " + nv.ten + "\t Mã NV: " + nv.maNv + "\t Năm sinh: " + nv.namSinh
                    + "\t Lương: " + nv.luong);
        }
    }
}