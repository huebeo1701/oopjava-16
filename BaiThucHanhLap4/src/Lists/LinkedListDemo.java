package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import Obj.Student;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int sophantu = sc.nextInt();
        Student.Add(linkList, sophantu);
        Student.Display(linkList);
        Student.Update(linkList);
        Student.Delete(linkList);
    }
}   
