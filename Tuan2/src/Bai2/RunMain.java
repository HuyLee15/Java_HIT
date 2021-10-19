package Bai2;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon = 0, n=0;
        List<Integer> arr = new ArrayList<Integer>();
        while (luachon != 8){
            System.out.print("Nhap vao lua chon: ");
            luachon = sc.nextInt();
            if(luachon == 1){
                System.out.print("Nhap vao so phan tu cua mang: ");
                n = sc.nextInt();
                for(int i=0; i<n; i++){
                    System.out.print("arr["+i+"] = ");
                    arr.add(sc.nextInt());
                }
            } else if(luachon == 2) {
                if (arr.size() == 0) System.out.println("Chua co phan tu nao trong mang");
                else {
                    System.out.println("Hien thi mang: ");
                    xuat(arr);
                }
            } else if(luachon == 3){
                if (arr.size() == 0) System.out.println("Chua co phan tu nao trong mang");
                else {
                    System.out.print("Nhap vao so muon chen: ");
                    int x = sc.nextInt();
                    System.out.print("Nhap vao vi tri muon chen: ");
                    int k = sc.nextInt();
                    arr.add(k-1,x);
                    System.out.println("Hien thi mang sau khi chen: ");
                    xuat(arr);
                }
            } else if(luachon == 4){
                if (arr.size() == 0) System.out.println("Chua co phan tu nao trong mang");
                else {
                    System.out.print("Nhap vao vi tri muon xoa: ");
                    int k = sc.nextInt();
                    arr.remove(k-1);
                    System.out.println("Hien thi mang sau khi xoa: ");
                    xuat(arr);
                }
            } else if(luachon == 5){
                if (arr.size() == 0) System.out.println("Chua co phan tu nao trong mang");
                else {
                    Collections.reverse(arr);
                    System.out.println("Hien thi mang sau khi dao nguoc: ");
                    xuat(arr);
                }
            } else if(luachon == 6){
                if (arr.size() == 0) System.out.println("Chua co phan tu nao trong mang");
                else {
                    System.out.println("Phan tu a[1] cua mang la: "+ arr.get(0));
                    System.out.println("Cac so chia het cho a[1] trong mang la: ");
                    for(var i:arr){
                        if (i%arr.get(0) == 0) System.out.print("\t"+i);
                    }
                    System.out.println();
                }
            } else if(luachon == 7){
                if (arr.size() == 0) System.out.println("Chua co phan tu nao trong mang");
                else {
                    int sum = 0;
                    for(var i:arr ){
                        if(isPrime(i)) sum+=i;
                    }
                    System.out.println("Tong cac so nguyen to trong mang la: "+sum);
                }
            } else if(luachon != 8) System.out.println("Lua chon sai");
        }
    }
    static void xuat(List<Integer> a){
        for (var i:a) {
            System.out.print("\t"+i);
        }
        System.out.println();
    }
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
