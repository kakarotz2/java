package Quan_ly_nhan_vien;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------~~~~~~Menu~~~~~~----------");
            System.out.println("\t1. Nhập NV hoặc danh sách NV");
            System.out.println("\t2. Xuất NV hoặc danh sách NV");
            System.out.println("\t3. Xuất danh sách NV có độ tuổi nhỏ hơn 35");
            System.out.println("\t4. Tìm NV theo mã");
            System.out.println("\t5. Xóa NV theo mã");
            System.out.println("\t6. Xuất danh sách NV sắp xếp theo tự giảm dần về mức lương");
            System.out.println("\t0. Nhấn 0 để thoát");
            System.out.println("----------~~~~~~Chọn đi~~~~~~----------");

            int key = sc.nextInt();
            System.out.println("----------------------------------------");
            switch (key) {
                case 1:
                    QLNV.nhapNv();
                    break;
                case 2:
                    QLNV.xuatNv();
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
}