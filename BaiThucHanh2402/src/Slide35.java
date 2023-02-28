import java.util.Scanner;
    public class Slide35{
        public static void main(String[] args){
            int a,b;
            Scanner sc= new Scanner(System.in);
            System.out.println("Nhap a =");
            a= sc.nextInt();
            System.out.println("Nhap b =");
            b= sc.nextInt();    
            if(a<b){
                System.out.println("So nho nhat la : " + a);
            }else{
                System.out.println("So nho nhat la :" +b);
            }
        }
    }
