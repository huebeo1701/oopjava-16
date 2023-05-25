import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        String tentraicay;
        int n;
        Scanner sc = new Scanner(System.in);
     
        // Tạo 1 HashSet có tên là hashSetFruits
        HashSet<String> hashSetFruits = new HashSet<String>();
         
        System.out.println("Nhap vao so phan tu cua hashSetFruits: ");
        n = Integer.parseInt(sc.nextLine());   // hạn chế hiện tượng trôi lệnh
             
        System.out.println("Nhap vao ten cac loai trai cay : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten cac loai trai cay thu " + i + ": ");
            tentraicay = sc.nextLine();
            hashSetFruits.add(tentraicay);
        }
     
        // hiển thị số phần tử của hashSetFruits
        // sử dụng phương thức size()
        System.out.println("So phan tu cua hashSetFruits = " + hashSetFruits.size());
          
        // tìm loại trái cây
        System.out.println("Nhap ten loai trai cay can tim : ");
        String timtraicay = sc.nextLine();
        if (hashSetFruits.contains(timtraicay)) {
            System.out.println("Co trai cay " + timtraicay + " trong hashSetFruits!");
        } else {
            System.out.println("Khong tim thay " + timtraicay);
        }
             
        // Xóa 1 loại trái cây bất kỳ trong HashSet đó và hiển thị các phần tử còn lại.
        System.out.println("Nhap vao loai trai cay can xoa: ");
        String xoatraicay = sc.nextLine();
     
        if (hashSetFruits.contains(xoatraicay)) {
            hashSetFruits.remove(timtraicay);
            System.out.println("Xoa thanh cong !");
            System.out.println("Cac loai trai cay con lai trong hashSetFruits: " + hashSetFruits);
        } else {
            System.out.println("Xoa khong thanh cong !");
        }
             
        // Tạo 1 List mới có cùng kiểu dữ liệu với HashSet
        // và thêm các phần tử của List này.
        List<String> listFruits = new ArrayList<>();
        listFruits.add("Tao");
        listFruits.add("Le");
        listFruits.add("Oi");
        listFruits.add("Dua");
     
        // thêm các phần tử của List này vào trong HashSet ban đầu 
        // và hiển thị lại HashSet này sử dụng Iterator.
        // sử dụng phương thức addAll()
        hashSetFruits.addAll(listFruits);
        System.out.println("Cac phan tu co trong hashSetFruits sau khi them : ");
        Iterator<String> iterator = hashSetFruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
             
        // Xóa các phần tử của List có trong HashSet và hiển thị lại HashSet
        // sử dụng phương thức removeAll()
        hashSetFruits.removeAll(listFruits);
        System.out.println("\nCac phan tu co trong hashSetFruits sau khi xoa: " + hashSetFruits);
    }
}
