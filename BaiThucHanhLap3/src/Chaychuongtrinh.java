public class Chaychuongtrinh {
    public static void main(String[] args) {
        //Bai 1
        HinhTron ht1 = new HinhTron();
        ht1.nhapbankinh();
        ht1.tinhchuvi();
        ht1.tinhdientich();
        ht1.hienthithongtin();

        //Bai 2
        HinhTruTron htt1 = new HinhTruTron();
        htt1.nhapbankinh();
        htt1.nhapchieucao();
        htt1.tinhchuvi();
        htt1.tinhdientich();
        htt1.tinhthetich();
        htt1.hienthithongtin();
        
        //Bai 3
        NhanVien nv = new NhanVien();
        nv.nhapthongtin();
        nv.luong();
        nv.hienthi();
    }
}
