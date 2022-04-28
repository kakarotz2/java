package Bai_tap_1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n, count = 0, tempSort;
        float sum = 0;
        float Tbc;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        // sắp xếp mảng và tìn giá trị nhỏ nhất
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] < array[j]) {
                    tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nPhần tử nhỏ nhất trong mảng là " + array[n - 1]);
        // tính trung bình cộng các phần tử chia hết cho 3
        for (int i = 0; i < n; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("\nMảng Không có phần tử nào bằng 3\n");
        } else {
            Tbc = sum / count;
            System.out.println("\nTổng trung bình các phần tử có trong mảng chia hết cho 3 = " + Tbc);
        }
        scanner.close();
    }
}