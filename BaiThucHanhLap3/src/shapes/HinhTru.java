package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru(){
        ten = "Hình Tru";
    }

    public void nhapChieuCao(){
        nhapBanKinh();

        System.out.println("Chieu Cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
