import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Nhập dãy số
        System.out.print("Nhap vao day so nguyen (nhap 0 de ket thuc): ");
        int input = sc.nextInt();
        while (input != 0) {
             arrayList.add(input);
             input = sc.nextInt();
        }

        // Tìm số nguyên có giá trị lớn nhất
        int max = Collections.max(arrayList);
        System.out.println("So nguyen lon nhat: " + max);

        // Nhập vào số nguyên và xoá khỏi mảng các phần tử có giá trị bằng số đó
        System.out.print("Nhap vao so nguyen can xoa: ");
        int deleteArr = sc.nextInt();
        arrayList.removeIf(number -> number == deleteArr);

        Collections.sort(arrayList);
        System.out.println("Day sau khi sap xep :");
        for (int number : arrayList) {
             System.out.print(number + " ");
        }
   }
}

