import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Nhap vao so phan tu cua danh sach : ");
        int n = sc.nextInt();

        for(int i = 0; i< n; i++){
            System.out.println("Nhap vao phan tu thu" + i + " : ");
            int number = sc.nextInt();
            linkedList.add(number);
        }
        double sum = 0;
        int dem = 0 ;
        for(int i = 0; i < n; i++){
            if(linkedList.get(i) % 2 == 0){
                sum += linkedList.get(i);
                dem ++;
            }
        }
        double tbc = (sum / dem );
        System.out.println("Trung binh cong cua cac so chan trong danh sach = " + tbc );
    }
}
