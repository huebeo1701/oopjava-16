import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) {
        int mang;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap kich thuc mang mot chieu : ");
            mang = sc.nextInt();
        }while(mang<=0);
            int arrB[] = new int[mang];

          //nhap du lieu
          for(int i=0;i<arrB.length; i++){
            System.out.printf("A[%d] = ", i);
            arrB[i] = sc.nextInt();
          } 

          //cac so chan
          int tong = 0;
          for( int i=0; i<arrB.length; i++){
          if(arrB[i]%2==0)
           {
            tong += arrB[i];
          } 
        }
        System.out.printf("Tong cac so chan = %d ", tong);
    } 
}

