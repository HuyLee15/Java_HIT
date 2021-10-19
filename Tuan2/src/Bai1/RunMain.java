package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so 1: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap vao so 2: ");
        int so2 = sc.nextInt();
        System.out.print("Nhap vao so 3: ");
        int so3 = sc.nextInt();
        System.out.println("So lon nhat trong 3 so la: " + Math.max(so1, Math.max(so2, so3)));
    }

}
