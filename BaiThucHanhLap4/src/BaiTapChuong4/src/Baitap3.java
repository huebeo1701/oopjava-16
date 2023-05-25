import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        String tenSinhVien, thongTin = null;
        String arrThongTin[];   
        double diemSinhVien;
             
        LinkedList<String> danhSachSV = new LinkedList<>();
             
        LinkedList<String> svThiLai = new LinkedList<>();
             
        LinkedList<String> svDiemCao = new LinkedList<>();
             
        LinkedList<String> svCanTim = new LinkedList<>();
             
        Scanner sc = new Scanner(System.in);
             
        do {
            System.out.println("Nhap vao ten sinh vien: ");
            tenSinhVien = sc.nextLine();
            if (!tenSinhVien.isEmpty()) {
                System.out.println("Nhap vao diem sinh vien: ");
                diemSinhVien = Double.parseDouble(sc.nextLine());
                thongTin = tenSinhVien + "\t" + diemSinhVien;
                danhSachSV.add(thongTin);
            }
        } while (!tenSinhVien.isEmpty());   
    
        System.out.println("So luong sinh vien co trong danh sach = " + (danhSachSV.size()));
        System.out.println("Thong tin sinh vien vua nhap la: ");
        System.out.println("Ten sinh vien \t Diem");
        Iterator<String> iterator = danhSachSV.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
             
        for (int i = 0; i < danhSachSV.size(); i++) {
        
            String sv = danhSachSV.get(i);  
     
            arrThongTin = sv.split("\t");
                 
            double point = Double.parseDouble(arrThongTin[1]);
                 
            if (point <= 5) {
                svThiLai.add(sv);
            }
        }
                 
        if (svThiLai.isEmpty()) {
            System.out.println("Khong co sinh vien phai thi lai!");
        } else {
            System.out.println("So sinh vien phai thi lai = " + (svThiLai.size()));
            System.out.println("Thong tin cua cac sinh vien phai thi lai la: ");
            System.out.println("Ten sinh vien \t Diem");
            iterator = svThiLai.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
             
        double maxTemp = 0; 
        int i = 0;
             
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            if (Double.parseDouble(arrThongTin[1]) >= maxTemp) {
                maxTemp = Double.parseDouble(arrThongTin[1]);
            }
            i++;
        }
     
        i = 0;
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            if (Double.parseDouble(arrThongTin[1]) == maxTemp) {
                svDiemCao.add(danhSachSV.get(i));
            }
            i++;
        }
             
        System.out.println("Thong tin sinh vien co diem cao nhat la : ");
        System.out.println("Ten sinh vien \t Diem");
        iterator = svDiemCao.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
             
        System.out.println("Nhap ten sinh vien can tim : ");
        String search = sc.nextLine();
             
        i = 0;
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
        
            tenSinhVien = arrThongTin[0];
                 
            if (search.equalsIgnoreCase(tenSinhVien)) {
                svCanTim.add(danhSachSV.get(i));
            }
                 
            i++;
        }
             
        System.out.println("Thong tin cua sinh vien la : " + search + ": ");
        System.out.println("Ten sinh vien \t Diem");
        iterator = svCanTim.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
