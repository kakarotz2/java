package Bai_tap_1;

import java.util.Scanner;

public class bai2 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Nhập số học sinh: ");
        n = sc.nextInt();
        // nhập tên sinh viên
        String b[] = new String[n];
        System.out.println("\n-----Nhập họ và tên học sinh-----");
        sc.nextLine();
        for (int j = 0; j < n; j++) {
            System.out.println("Họ và tên học sinh thứ " + j + " : ");
            b[j] = sc.nextLine();
        }
        // nhập điểm học sinh
        float a[] = new float[n];
        System.out.println("-----Nhập điểm học sinh-----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nĐiểm học sinh thứ " + i + " : ");
            a[i] = sc.nextFloat();
        }
        // xuất tên học sinh
        for (int j = 0; j < n; j++)
            System.out.print("\nHọ và tên học sinh là " + j + " : " + b[j]);
        // xuất điểm học sinh
        for (int i = 0; i < n; i++)
            System.out.print("\nĐiểm trung bình học sinh thứ " + i + " : " + a[i]);
    }

}
