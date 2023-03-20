import java.util.Scanner;

public class Bai11 {
    
    public static void main(String[] args) throws Exception {
       int mang;
       Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap kich thuc mang :");
            mang = sc.nextInt();
        }while(mang <= 0);
           int arrA[]= new int[mang];

               //Nhap du lieu mang
               for(int i=0;i<arrA.length; i++){
                System.out.printf("A[%d] = ", i);
                arrA[i]=sc.nextInt();
               }
               //Sap xep mang tang dan
               for(int i=0; i<arrA.length-1; i++){
                int tg;
                for(int j=i+1; j<arrA.length;j++){
                if(arrA[i]>arrA[j]){
                    tg = arrA[i];
                    arrA[i]=arrA[j];
                    arrA[j]=tg;
                    }
                }
            }
                for(int i = 0; i<arrA.length; i++){
                    System.out.printf("%d\t",arrA[i]);
                    
        }
    }
}