import java.util.ArrayList;
import java.util.Scanner;

public class Slide24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua ArrayList :");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i +" : ");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
        for(int i = 1; i<arrListInteger.size(); i++){
            if(arrListInteger.get(i).compareTo(max)> 0){
                max = arrListInteger.get(i);
            }
        }
        int min = arrListInteger.get(0);
        for(int i = 1; i<arrListInteger.size(); i++){
            if(arrListInteger.get(i).compareTo(min)< 0){
                min = arrListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
        System.out.println("Phan tu nho nhat trong arrListInteger = " + min);
    }        
}
