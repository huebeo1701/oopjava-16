package TestBai2DanhBa;

import java.util.Scanner;

import Bai2DanhBa.CapnhatDB;
    
public class test {
     public static void main(String[] args) {
          CapnhatDB pb = new CapnhatDB();
          Scanner sc = new Scanner(System.in);
          boolean tmp = true;
          while(tmp){
               System.out.println("1.themsdt");
               System.out.println("2.xoasdt");
               System.out.println("3.timkiemsdt");
               System.out.println("4.capnhatsdt");
               System.out.println("5.exit");
               int select = sc.nextInt();
               switch (select) {
                    case 1:
                         
                         System.out.print("phoneNumber :"); String phoneNumber = sc.nextLine();
                         pb.themsdt(name, phoneNumber);
                         break;
                    case 2:
                         System.out.print("Ten can xoa :"); String namedl = sc.nextLine();
                         pb.xoasdt(namedl);
                         break;
                    case 3:
                         System.out.print("Ten can tim :"); String namef = sc.nextLine();
                         pb.timkiemsdt(namef);
                         break;
                    case 4:
                         System.out.print("Ten can cap nhat :"); String nameud = sc.nextLine();
                         System.out.print("So dien thoai moi :"); String NewPhoneNumber = sc.nextLine();
                         pb.capnhatsdt(nameud, NewPhoneNumber);
                         break;
                    case 5:
                         tmp = false;
                    default:
                         System.out.println("Nhap sai du lieu !");
                         break;
               }
          }
     }
}
       

