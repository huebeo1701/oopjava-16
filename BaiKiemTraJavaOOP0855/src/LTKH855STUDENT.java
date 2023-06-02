import java.util.Scanner;

import javax.print.attribute.SupportedValuesAttribute;

public class LTKH855STUDENT {
    public String hoten;
    public static int lop ;
    public float msv;

    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho ten cua sinh vien : ");
        hoten = sc.nextLine();
        System.out.println("Nhap vao lop cua sinh vien : ");
        lop = sc.nextInt();
        System.out.println("Nhap vao ma so cua sinh vien :");
        msv = sc.nextFloat();
    }
    
    public static void ThemThongTin(){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Thong tin can them vao : ");
        System.out.println("Thong tin sau khi them vao : ");
        }
    }

    public static void SuaThongTin(){
        System.out.println("Thong tin can sua : ");
        System.out.println("Thong tin sau khi sua : ");
    }

    public static void XoaThongTin(){
        System.out.println("Thong tin can xoa : ");
        System.out.println("Thong tin sau khi xoa : ");
    }

    public static void HienThi(){

    }

}
