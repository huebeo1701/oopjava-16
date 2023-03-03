import java.util.Scanner;

public class Bài19 {
 
public static void main(String[] args) {
    int n;
Scanner sc = new Scanner(System.in);
    System.out.println("Nhap so nguyen tu 0 den 8 : ");
    n = sc.nextInt();

    switch (n) {
        case 2:{
            System.out.println("Thu hai : ");
            break;
        }
        case 3:{
            System.out.println("thu 3 :");
            break;
        }
        case 4:{
            System.out.println("Thu 4 :" );
            break;
        }
        case 5:{
            System.out.println("Thu 5 :");
            break;
        }
        case 6:{
            System.out.println("Thu 6 :");
            break;
        }
        case 7:{
            System.out.println("Thu 7 :");
            break;
        }
        case 8:{
            System.out.println("Chu nhat");
        break;
        }
        default:

        System.out.println("Nhap du lieu sai ! ");
            break;

    }
 }   
}
