package BaiThucHanh2104;

public class HinhTron extends HinhHoc {
    private float banKinh;
    // private String ten;

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh= banKinh;
    }

    @Override
    public void ten() {
        // TODO Auto-generated method stub
        System.out.println("Hinh Tron");
    }

    @Override
    double tinhchuvi() {
        // TODO Auto-generated method stub
        return getPI() * 2 *banKinh ;
    }

    @Override
    double tinhdientich() {
        // TODO Auto-generated method stub
        return getPI() * banKinh * banKinh;
    }

    
}
    