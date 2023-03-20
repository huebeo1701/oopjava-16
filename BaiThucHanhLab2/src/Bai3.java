import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ten :");
            String ten = sc.nextLine();
            System.out.println("Nhap vao so bat ki :");
            int nam= sc.nextInt();
            int tuoi=0; 
            tuoi=2023-nam;
            if(tuoi<16){
                System.out.println("Ban "+ten+" o tuoi vi thanh vien");
            }if(tuoi >=16 || tuoi<18){
                System.out.println("Ban "+ten+" o do tuoi truong thanh ");
            }if(tuoi >=18){
                System.out.println("Ban "+ten+" da gia");
            }
    }
}
