package bai4;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void nhapThongTinh(SinhVienNhap tt) {
        System.out.println("Nhập họ và tên sinh viên: ");
        tt.settenSv(sc.nextLine());
        System.out.println("Nhập điểm sinh viên: ");
        tt.setdiemTb(sc.nextFloat());
    }

    public static void main(String[] args) {
        SinhVienNhap sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("Bạn chọn làm gì?");
            System.out.println(
                    "1.Nhập thông tin sinh viên. \n" + "2.Xuất bản danh sách sinh viên.\n" + "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Nhập số lương sinh viên cần khai báo: ");
                    n = sc.nextInt();
                    sv = new SinhVienNhap[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1) + ": ");
                        sv[i] = new SinhVienNhap();
                        nhapThongTinh(sv[i]);

                    }
            }
        } while (flag);
    }
}