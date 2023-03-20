import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        //khai bao phuong thuc nhap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ky tu khong qua 80 ky tu :");
        //nhap tu ban phim vao bien khoi tao la n
        String n = sc.nextLine();
        System.out.println("Nhap vao mot ky tu bat ky :");
        char c = sc.nextLine().charAt(0);
        //khoi tao bien dem
        int dem = 0;
        //lap qua tung phan tu trong chuoi
        for(int i = 0 ; i < n.length(); i++){
            //kiem tra neu ky tu trong chuoi co bang ky tu nhap bat ky hay khong
            //neu true thi tang bien dem len 
            //nguoc lai thi bo qua
            if(n.charAt(i) == c){
                dem++;
            }
        }
        System.out.println("so lan xuat hien cua ky tu la :" + dem);
    }
}
