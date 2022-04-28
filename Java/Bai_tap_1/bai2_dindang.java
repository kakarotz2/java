package Bai_tap_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai2_dindang {
    // Định dạng Email
    public static void Email() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào Email của bạn: ");
        String email = sc.nextLine();
        String resgex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(resgex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("Email hợp lệ!");
        } else {
            System.out.println("Email không hợp lệ vui lòng nhập lại!");
        }
        sc.close();
    }

    // Định dang Số điện thoại
    public static void Sdt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại của bạn:");
        String sdt = sc.nextLine();
        String pattern = "0[0-9]{9,10}";
        if (sdt.matches(pattern)) {
            System.out.println("Số điện thoại hợp lệ!");
        } else {
            System.out.println("Số điện thoại không hợp lệ vui lòng nhập lại!");
        }
        sc.close();
    }

    // Định dạng số cmnd
    public static void Cmnd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cmnd của bạn:");
        String cmnd = sc.nextLine();
        String pattern = "[0-9]{9}";
        if (cmnd.matches(pattern)) {
            System.out.println("Số cmnd!");
        } else {
            System.out.println("Số cmnd không hợp lệ vui lòng nhập lại!");
        }
        sc.close();
    }

    // Chuẩn hóa tên
    static void ChuanHoa(String s) {
        s = s.toLowerCase();
        String[] ss;
        String s2 = "";
        ss = s.split(" ");
        for (int i = 0; i < ss.length; i++) {
            String s1 = "";
            if (ss[i].length() != 0) {
                s1 += Character.toUpperCase(ss[i].charAt(0));
                if (ss[i].length() > 1)
                    s1 += ss[i].substring(1);
                s2 += s1;
                if (i < ss.length)
                    s2 += " ";
            }
        }
        System.out.print("Tên sau khi chuẩn hóa là: " + s2);
    }

    static void nhap() {
        String str;
        System.out.println("Nhập tên muốn chuẩn hóa: ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        ChuanHoa(str);
        sc.close();
    }

    // Main
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Email();
        Sdt();
        nhap();
        Cmnd();
        sc.close();
    }
}