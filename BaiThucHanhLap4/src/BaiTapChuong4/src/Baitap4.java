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
    
        HashSet<String> hashSetFruits = new HashSet<String>();
         
        System.out.println("Nhap vao so phan tu cua hashSetFruits: ");
        n = Integer.parseInt(sc.nextLine()); 
        System.out.println("Nhap vao ten cac loai trai cay : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten cac loai trai cay thu " + i + ": ");
            tentraicay = sc.nextLine();
            hashSetFruits.add(tentraicay);
        }
     
        System.out.println("So phan tu cua hashSetFruits = " + hashSetFruits.size());
          
        System.out.println("Nhap ten loai trai cay can tim : ");
        String timtraicay = sc.nextLine();
        if (hashSetFruits.contains(timtraicay)) {
            System.out.println("Co trai cay " + timtraicay + " trong hashSetFruits!");
        } else {
            System.out.println("Khong tim thay " + timtraicay);
        }
             
        System.out.println("Nhap vao loai trai cay can xoa: ");
        String xoatraicay = sc.nextLine();
     
        if (hashSetFruits.contains(xoatraicay)) {
            hashSetFruits.remove(timtraicay);
            System.out.println("Xoa thanh cong !");
            System.out.println("Cac loai trai cay con lai trong hashSetFruits: " + hashSetFruits);
        } else {
            System.out.println("Xoa khong thanh cong !");
        }
             
        List<String> listFruits = new ArrayList<>();
        listFruits.add("Tao");
        listFruits.add("Le");
        listFruits.add("Oi");
        listFruits.add("Dua");
     
        hashSetFruits.addAll(listFruits);
        System.out.println("Cac phan tu co trong hashSetFruits sau khi them : ");
        Iterator<String> iterator = hashSetFruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
             
        hashSetFruits.removeAll(listFruits);
        System.out.println("\nCac phan tu co trong hashSetFruits sau khi xoa: " + hashSetFruits);
    }
}
