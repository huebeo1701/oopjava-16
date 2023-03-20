import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi :");
        String n = sc.nextLine();
        int demso = 0;
        int demkyTuVietHoa = 0;
        int demkyTuVietThuong = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (Character.isUpperCase(c)) {
                demkyTuVietHoa++;
            } else if (Character.isLowerCase(c)) {
                demkyTuVietThuong++;
            } else if (Character.isDigit(c)) {
                demso++;
            }
        }
        System.out.println("So luong ky tu viet hoa la : " + demkyTuVietHoa);
        System.out.println("So luong ky tu viet thuong la : " + demkyTuVietThuong);
        System.out.println("So luong so la : " + demso);

    }
}
