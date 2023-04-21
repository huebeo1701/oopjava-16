package BaiThucHanh2104;

public class HinhVuong extends HinhHoc {
    private float canh;
    public HinhVuong(float canh){
        this.canh = canh;
    }
    public float getCanh(){
        return canh;
    }
    public void setCanh(float canh){
        this.canh = canh;
    }

    @Override
    public void ten() {
        // TODO Auto-generated method stub
        
        System.out.println("Hinh Vuong");
    }

    @Override
    double tinhchuvi() {
        // TODO Auto-generated method stub
        return canh * 4;
    }

    @Override
    double tinhdientich() {
        // TODO Auto-generated method stub
        return canh * canh;
    }
}
