import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao day so nguyen (nhap 0 de ket thuc): ");
        int input = sc.nextInt();
        while (input != 0) {
             arrayList.add(input);
             input = sc.nextInt();
        }

        int max = Collections.max(arrayList);
        System.out.println("So nguyen lon nhat: " + max);

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

