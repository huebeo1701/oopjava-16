package BaiThucHanh2104;

public class Test {
    public static void main(String[] args) {
        HinhHoc ht = new HinhTron(3);
        ht.ten();
        System.out.println("Chu vi = " + ht.tinhchuvi());
        System.out.println("Dien tich = " + ht.tinhdientich());
        System.out.println("-------");

        HinhHoc hcn = new HinhChuNhat(4, 3);
        hcn.ten();
        System.out.println("Chu vi = " + hcn.tinhchuvi());
        System.out.println("Dien tich = " +hcn.tinhdientich());
        System.out.println("-------");

        HinhHoc htru = new HinhTru(4, 7);
        htru.ten();
        System.out.println("The tich = " + htru.tinhthetich());
        System.out.println("-------");
        
        HinhHoc hv = new HinhVuong(5);
        hv.ten();
        System.out.println("Chu vi = " + hv.tinhchuvi());
        System.out.println("Dien tich = " + hv.tinhdientich());
    }
}
