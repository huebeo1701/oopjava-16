import java.util.Scanner;

public class NhanVien {
    //Khai bao thuoc tinh
    public String hoten;
    public int tuoi;
    public float hesoluong;
    final int luongcoban=1490000;
    public float luong;

    // khai bao cac phuong thuc
    public void nhapthongtin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho va ten nhan vien :");
        hoten = sc.nextLine();
        System.out.println("Nhap vao tuoi cua sinh vien");
        tuoi = sc.nextInt();
        System.out.println("Nhap vao he so luong :");
        hesoluong = sc.nextFloat();
    }
    public float luong()
    {
        luong= luongcoban * hesoluong;
        return luong;
    }
    public void hienthi()
    {
        System.out.printf("Nhan Vien %s - %d tuoi \n", hoten, tuoi);
        System.out.printf("He so luong %.2f: \n", hesoluong);
        System.out.printf("Luong : %.2f", luong);
    }

}

