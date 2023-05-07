package Sets;

import java.util.HashSet;
import java.util.Scanner;
import Obj.StudentHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<StudentHashSet> hastList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu : ");
        int sophantu = sc.nextInt();
        StudentHashSet.Add(hastList, sophantu);
        StudentHashSet.Display(hastList);
        StudentHashSet.Update(hastList);
        StudentHashSet.Delete(hastList);
    }
}
