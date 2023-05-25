package Baitap5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SinhVien {
     public String msv;
     public String hvt;
     public String lop;

     public static void NhapDSSinhVien(Map<String, List<SinhVien>> svm) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap vao so luong sinh vien :");
          int n = sc.nextInt();
          sc.nextLine();
          for (int i = 0; i < n; i++) {
               System.out.println("Nhap sinh vien thu " + (i + 1));
               SinhVien sv = new SinhVien();
               System.out.println("Nhap vao ma sinh vien :");
               sv.msv = sc.nextLine();
               System.out.println("Nhap vao ho va ten sinh vien :");
               sv.hvt = sc.nextLine();
               System.out.println("Nhap vao lop cua sinh vien :");
               sv.lop = sc.nextLine();
               List<SinhVien> newSinhVien = svm.getOrDefault(sv.lop, new ArrayList<>());
               newSinhVien.add(sv);
               svm.put(sv.lop, newSinhVien);
          }
     }
     public static void DsSvThuocLopVuaNhap(Map<String, List<SinhVien>> svm) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap ten lop cua sinh vien: ");
          String tmpLop = sc.nextLine();

          System.out.println("Danh sach sinh vien thuoc lop " + tmpLop + ":");
          List<SinhVien> listSinhVien = svm.get(tmpLop);
          if (listSinhVien != null) {
               for (SinhVien sv : listSinhVien) {
                    System.out.println("Ma sinh vien : " + sv.msv);
                    System.out.println("Ho va ten sinh vien : " + sv.hvt);
                    System.out.println("Lop cua sinh vien : " + sv.lop);
                    System.out.println();
               }
          } else {
               System.out.println("Khong tim thay sinh vien !");
          }
     }

     public static void DsSvThuocMaSinhVien(Map<String, List<SinhVien>> svm) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Nhap Ma sinh vien: ");
          String tmpMsv = sc.nextLine();

          boolean found = false;
          for (List<SinhVien> lop : svm.values()) {
               for (SinhVien sv : lop) {
                    if (sv.msv.equalsIgnoreCase(tmpMsv)) {
                         System.out.println("Ho va ten sinh vien: " + sv.hvt);
                         System.out.println("Lop cua sinh vien : " + sv.lop);
                         found = true;
                         break;
                    }
               }
               if (found) {
                    break;
               }
          }

          if (!found) {
               System.out.println("Khong tim thay sinh vien !");
          }
     }

}
