import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so bat ki :");
        int n = sc.nextInt();
        if(n % 2==0){
         System.out.println("La so chan !");
        }else{
        System.out.println("La so le !");
        }
    }
}
