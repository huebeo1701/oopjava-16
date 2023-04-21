package Bai2DanhBa;

import java.util.ArrayList;

public class CapnhatDB implements DanhBaDT{

    ArrayList<contact> arrylistCT = new ArrayList<>();

    @Override
    public void themsdt(String name, String sdt) {
       contact newContact = new contact(name, sdt);
       arrylistCT.add(newContact);
       System.out.println("Them thanh cong");
    }

    @Override
    public void xoasdt(String name) {
       for(int i = 0; i < arrylistCT.size(); i++){
           contact ct = arrylistCT.get(i);
           if(ct.getName().equals(name)){
               arrylistCT.remove(i);
               System.out.println("Xoa thanh cong");
               return;
           }
       }
       System.out.println("Khong tim thay ");
   }

    @Override
    public void timkiemsdt(String name) {
       for (contact ct : arrylistCT) {
           if(ct.getName().equals(name)){
               System.out.println(name + "co SDT la : "+ ct.getSdt());
           }
       }
       System.out.println("Khong tim thay");
   }

    @Override
    public void capnhatsdt(String name, String newsdt) {
       for (contact ct : arrylistCT) {
           if(ct.getName().equals(name)){
               ct.setSdt(newsdt);
               System.out.println("Cap nhat thanh cong");
               return;
          }
       }
       System.out.println("Khong tim thay");
   } 
}
