package Baitap5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<String, List<SinhVien>> Svm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Nhap vao so luong sinh vien ! ");
            System.out.println("2.Hien thi sinh vien theo lop  ! ");
            System.out.println("3.Hien thi sinh vien theo ma sinh vien ! ");
            System.out.println("4. Thoat ! ");
            int selector = sc.nextInt();
            switch(selector){
                case 1:
                    SinhVien.NhapDSSinhVien(Svm);
                    break;
                case 2:
                    SinhVien.DsSvThuocLopVuaNhap(Svm);
                    break;
                case 3:
                    SinhVien.DsSvThuocMaSinhVien(Svm);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Nhap sai du lieu !");
                    break;
            }
        }
    }
}
