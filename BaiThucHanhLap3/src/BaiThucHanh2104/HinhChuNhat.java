package BaiThucHanh2104;

public class HinhChuNhat extends HinhHoc {
    private float chieuDai, chieuRong;

    public HinhChuNhat(float chieuDai, float chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(float chieuDai){
        this.chieuDai = chieuDai;
    }

    public float getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(float chieuRong){
        this.chieuRong = chieuRong;
    }
    
    @Override
    public void ten() {
        // TODO Auto-generated method stub
        System.out.println("Hinh Chu Nhat");
    }

    @Override
    double tinhchuvi() {
        // TODO Auto-generated method stub
        return 2 * (chieuDai + chieuRong);
    }
    
    @Override
    double tinhdientich() {
        // TODO Auto-generated method stub
        return chieuDai * chieuRong;    }
    
}
