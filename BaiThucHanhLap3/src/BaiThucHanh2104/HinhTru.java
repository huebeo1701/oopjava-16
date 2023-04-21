package BaiThucHanh2104;

public class HinhTru extends HinhHoc {

    private float banKinh, chieuCao;


    public HinhTru(float banKinh, float chieuCao) {
        this.banKinh = banKinh;
        this.chieuCao = chieuCao;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh= banKinh;
    }

    public HinhTru(float chieuCao){
        chieuCao = chieuCao;
        this.chieuCao = chieuCao;
    }

    public float getChieuCao(){
        return chieuCao;
    }
    public void setChieuCao(float chieuCao){
        this.chieuCao = chieuCao;
    }

    @Override
    public void ten() {
        // TODO Auto-generated method stub
        System.out.println("Hinh Tru");
    }

    @Override
    double tinhthetich() {
        // TODO Auto-generated method stub
        return getPI() * banKinh * banKinh* chieuCao;
    }
}

