import java.util.Scanner;

public class HinhTruTron {
    // Khai bao cac thuoc tinh
    public float BanKinh;
    public float ChieuCao;
    public float ChuVi;
    public float DienTich;
    public float TheTich;
    final float PI = 3.14f;

    
    //Khai bao cac phuong thuc
    public void nhapbankinh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tru tron :");
        BanKinh = sc.nextFloat();
    }
    public void nhapchieucao()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao hinh tru tron :");
        ChieuCao = sc.nextFloat();
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
    public float tinhthetich()
    {
         TheTich = PI * BanKinh *BanKinh *ChieuCao;
        return TheTich;
    }
    public void hienthithongtin()
    {
        System.out.printf("Ban Kinh : %.2f \n",BanKinh);
        System.out.printf("Chieu Cao : %.2f \n",ChieuCao);
        System.out.printf("Chu vi : %.2f \n",ChuVi);
        System.out.printf("Dien tich  : %.2f \n",DienTich);
        System.out.printf("The tich : %.2f",TheTich);
    }
}
