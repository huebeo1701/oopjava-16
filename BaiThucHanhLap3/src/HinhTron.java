import java.util.Scanner;

public class HinhTron {
    // Khai bao cac thuoc tinh
    public float BanKinh;
    public float ChuVi;
    public float DienTich;
    final float PI = 3.14f;
    
    //Khai bao cac phuong thuc
    public void nhapbankinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron :");
        BanKinh = sc.nextFloat();
    }
    public float tinhchuvi()
    {
        ChuVi = 2* PI * BanKinh;
        return ChuVi;
    }
    public float tinhdientich()
    {
        DienTich = PI * BanKinh *BanKinh;
        return DienTich;
    }
    public void hienthithongtin()
    {
        System.out.printf("Ban Kinh : %.2f \n",BanKinh);
        System.out.printf("Chu Vi : %.2f \n",ChuVi);
        System.out.printf("Dien Tich : %.2f \n",DienTich);
    }
}
