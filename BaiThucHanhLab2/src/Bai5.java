import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        String str= "";
          Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Nhap vao cac so nguyen :");
        n = sc.nextInt(); 
        tong += n;
        str = n + "+" +str;
    }while( tong <= 100);
    System.out.println("Tong cac so nguyen la :" +str.substring(0, str.length()-1)+ "="  +tong);    
    }
}