import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
             
        Scanner scanner = new Scanner(System.in);
        int dong, cot ;
        System.out.println("Nhap so dong: ");
        dong = scanner.nextInt();
        System.out.println("Nhap vao so cot ");
        cot = scanner.nextInt();

        int A[][] = new int[dong][cot];
             
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("A[%d][%d] =", i, j);
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
             
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
        System.out.println("Phan tu cos gia tri lon nhat la = " + max);
    }
    
}
