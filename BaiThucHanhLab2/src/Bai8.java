import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so luong so nguyen");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("So thu :" + i);
            int x = sc.nextInt();
            tong += x;
        }
        int tbc;
        tbc = tong / n;
        System.out.println("TBC = " + tbc);
    }
}
