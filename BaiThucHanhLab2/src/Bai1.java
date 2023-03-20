import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat :");
        int a = sc.nextInt();
        System.out.println("Nhap vao so thu hai :");
        int b = sc.nextInt();
        //1.Phep tinh
        int tong = a+b;
        System.out.println(a + "+" + b +"=" + tong);
        int hieu = a-b;
        System.out.println(a + "-" + b +"=" + hieu);
        int tich = a*b;
        System.out.println(a + "*" + b +"=" + tich);
        float thuong = a/b;
        System.out.println(a + "/" + b +"=" + thuong);
        float du = a%b;
        System.out.println(a + "%" + b +"=" + du);
       
        // 2.So sanh 2 so
        System.out.println("Ket qua phep so sanh bang cua 2 so la :" + a + " va " + b + " la " + ( a==b ));
        System.out.println("Ket qua phep so sanh khac cua 2 so la :" + a + " va " + b + " la " + ( a!=b ));
        System.out.println("Ket qua phep so sanh lon hon cua 2 so la :" + a + " va " + b + " la " + ( a>b ));
        System.out.println("Ket qua phep so sanh lon hon hoac bang cua 2 so la :" + a + " va " + b + " la " + ( a>=b ));
        System.out.println("Ket qua phep so sanh nho hon cua 2 so la :" + a + " va " + b + " la " + ( a<b ));
        System.out.println("Ket qua phep so sanh nho hon hoac bang cua 2 so la :" + a + " va " + b + " la " + ( a<=b ));


    }
}
