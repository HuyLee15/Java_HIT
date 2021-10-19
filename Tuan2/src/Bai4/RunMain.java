package Bai4;

import java.util.Locale;
import java.util.Scanner;

//Không có khoảng trắng thừa 2 đầu
//Giữa các từ chỉ có 1 khoảng trắng
//Không chứa ký tự số
//Ký tự đầu mỗi từ phải viết hoa


public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi: ");
        String s = sc.nextLine();
        s = s.trim().toLowerCase();
        while (s.indexOf("  ") != -1) s = s.replaceAll("  "," ");
        String[] st = s.split(" ");
        s = "";
        for (int i=0; i< st.length; i++){
            s += String.valueOf(st[i].charAt(0)).toUpperCase() + st[i].substring(1);
            if (i < st.length - 1)
                s += " ";
        }


        System.out.println(s);
    }
}
