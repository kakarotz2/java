package Bai_2;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void nhapThongTin(SanPham sp) {
        sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        sp.setTenSanPham(sc.nextLine());
        System.out.print("Nhập giá trị sản phẩm: ");
        sp.setGia(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập hãng sản phẩm: ");
        sp.setHang(sc.nextLine());
    }

    public static void main(String[] args) {
        SanPham tt[] = null;
        int n;
        System.out.print("Nhập số lượng sản phẩm: ");
        n = sc.nextInt();
        tt = new SanPham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1) + ": ");
            tt[i] = new SanPham();
            nhapThongTin(tt[i]);
        }
        System.out.printf("%-5s %15s %15s \n", "Tên sản phẩm", "Giá", "Hãng sản xuất");
        for (int i = 0; i < n; i++) {
            tt[i].hienThiTT();
        }
    }
}