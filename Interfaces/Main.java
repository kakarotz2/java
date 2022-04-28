package Interfaces;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("1. tinh tong");
        System.out.println("2. phep tru");
        System.out.println("3. phep chia");
        System.out.println("4. phep nhan");
        System.out.println("5. Giai pt bac 1");
    }

    public static void Maytinh() {
        System.out.println("1. fx500");
        System.out.println("2. fx Casio");
        System.out.println("3. thoat");
    }

    public static void main(String[] args) {
        boolean key = true;
        while (key) {
            Maytinh();
            System.out.print("Ban muon chon may tinh nao: ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    while (key) {
                        showMenu();
                        System.out.print("Nhap vao lua chon cua ban: ");
                        int choose = sc.nextInt();
                        if (0 > choose | choose < 6) {
                            System.out.print("Nhap vao so thu 1: ");
                            double a = sc.nextDouble();
                            System.out.print("Nhap vao so thu 2: ");
                            double b = sc.nextDouble();
                            fx500 x500 = new fx500();
                            switch (choose) {
                                case 1:
                                    System.out.println("Tong cua 2 so la: " + a + " + " + b + " = " + x500.cong(a, b));
                                    break;
                                case 2:
                                    System.out.println("Hieu cua 2 so la: " + a + " - " + b + " = " + x500.tru(a, b));
                                    break;
                                case 3:
                                    System.out
                                            .println("Thuong cua 2 so la: " + a + " / " + b + " = " + x500.chia(a, b));
                                    break;
                                case 4:
                                    System.out.println("Tich cua 2 so la: " + a + " - " + b + " = " + x500.nhan(a, b));
                                    break;
                                case 5:
                                    if (a == 0) {
                                        if (b == 0)
                                            System.out.println("PT vo so nghiem");
                                        else
                                            System.out.println("PT vo nghiem");
                                    } else {
                                        System.out.println("pt co nghiem la: " + (-b / a));
                                    }
                                    break;
                            }
                        } else {
                            System.out.println("vui long nhap lai lua chon!");
                        }
                    }
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    System.out.println("Bye!!");
                    key = false;
                    break;
                default:
                    System.out.println("vui long nhap lai");
            }

        }
    }

}
