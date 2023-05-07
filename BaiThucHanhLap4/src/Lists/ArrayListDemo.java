package Lists;

import java.util.ArrayList;
import java.util.Scanner;
import Obj.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int sophantu = sc.nextInt(); 
        Student.Add(arrayList, sophantu);
        Student.Display(arrayList);
        Student.Update(arrayList);
        Student.Delete(arrayList);
    }
}
