package Bai3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();
        if(s.isEmpty()) System.out.println(false);
        else System.out.println(true);
        if(s.length()==0) System.out.println("Chuoi rong, khong co ky tu la chu so!");
        else {
            int sum = 0;
            int dem = 0;
            String[] a = s.split("");
            for(int i=0; i<a.length; i++){
                if(s.codePointAt(i) >=48 && s.codePointAt(i)<=57){
                    sum+= Integer.parseInt(a[i]);
                    dem++;
                }
            }
            if(dem==0) System.out.println("Chuoi khong co ky tu so!");
            else System.out.println("Trung binh cong: "+(float)sum/dem + "va dem = "+dem);
        }
    }
}
