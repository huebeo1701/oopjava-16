import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        String tenSinhVien, thongTin = null;
        String arrThongTin[];   // mảng lưu trữ thông tin sinh viên
        double diemSinhVien;
             
        // lưu trữ danh sách sinh viên
        LinkedList<String> danhSachSV = new LinkedList<>();
             
        // lưu trữ danh sách sinh viên thi lại
        LinkedList<String> svThiLai = new LinkedList<>();
             
        // lưu trữ danh sách sinh viên có điểm cao nhất
        LinkedList<String> svDiemCao = new LinkedList<>();
             
        // lưu trữ danh sách sinh viên cần tìm
        LinkedList<String> svCanTim = new LinkedList<>();
             
        Scanner scanner = new Scanner(System.in);
             
        do {
            System.out.println("Nhap vao ten sinh vien: ");
            tenSinhVien = scanner.nextLine();
            if (!tenSinhVien.isEmpty()) {
                System.out.println("Nhap vao diem sinh vien: ");
                diemSinhVien = Double.parseDouble(scanner.nextLine());
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
             
        double maxTemp = 0; // số điểm lớn nhất
        int i = 0;  // chỉ số của phần tử
             
        // tìm điểm lớn nhất trong danh sách
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            // nếu điểm của sinh viên có chỉ số i trong danhSachSV
            // lớn hơn hoặc bằng số điểm lớn nhất maxTemp
            // thì sẽ gán maxTemp bằng điểm của sinh viên đó
            // và tăng i lên 1 sau đó quay lại vòng lặp while
            if (Double.parseDouble(arrThongTin[1]) >= maxTemp) {
                maxTemp = Double.parseDouble(arrThongTin[1]);
            }
            i++;
        }
     
        // tìm sinh viên có điểm cao nhất
        i = 0;
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            // duyệt trong danhSachSV
            // nếu có sinh viên nào có số điểm bằng với maxTemp 
            // thì sẽ thêm sinh viên đó vào trong svDiemCao
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
             
        // Tìm kiếm theo tên sinh viên
        System.out.println("Nhap ten sinh vien can tim : ");
        String search = scanner.nextLine();
             
        i = 0;
        while (i < danhSachSV.size()) {
            // tách thông tin của sinh viên thứ i trong danhSachSV
            // thành 2 mảng lưu trữ tên và điểm số sinh viên đó
            arrThongTin = danhSachSV.get(i).split("\t");
                 
            // lấy tên sinh viên trong mảng arrThongTin
            // tên sẽ tương ứng với phần tử thứ 0 trong mảng
            tenSinhVien = arrThongTin[0];
                 
            // so sánh tên sinh viên cần tìm với tenSinhVien
            // nếu trùng nhau thì sẽ thêm sinh viên đó vào trong svCanTim
            if (search.equalsIgnoreCase(tenSinhVien)) {
                svCanTim.add(danhSachSV.get(i));
            }
                 
            i++;    // tăng i lên 1 và quay lại đầu vòng lặp
        }
             
        System.out.println("Thong tin cua sinh vien la : " + search + ": ");
        System.out.println("Ten sinh vien \t Diem");
        iterator = svCanTim.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
