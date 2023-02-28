import java.util.Scanner;
public class Slide34 {
    public static void main(String[] args){
        double a,b,c,x1,x2,delta;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap a =");
        a= sc.nextDouble();
        System.out.println("Nhap b =");
        b= sc.nextDouble();
        System.out.println("Nhap c =");
        c= sc.nextDouble();

        delta= Math.pow(b, 2)-4*a*c;
        if(a==0){
            System.out.println("Nhap sai du lieu!");
        }else{
        if(delta <0){
        System.out.println("Phuong trinh vo nghiem!");
        }else if (delta == 0){
        x1= -b/(2*a);
        System.out.println("Phuong trinh co nghiem kep x1=x2" +x1);
        }else{
            x1= (-b-Math.sqrt(delta))/(2*a);
            x2= (-b-Math.sqrt(delta))/(2*a);
        System.out.println("Phuong trinh co nghiem!");
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        }
    }
}
}