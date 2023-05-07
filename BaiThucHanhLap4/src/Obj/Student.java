package Obj;

import java.util.List;
import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;

     public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        FullName= sc.nextLine();
        System.out.println("Nhap tuoi : ");
        Age = sc.nextInt();
    }

     public static void Display(List<Student> listStudent){
        for(int i = 0 ; i<listStudent.size(); i++)
        {
            
            String fName = listStudent.get(i).FullName;
            int tuoi = listStudent.get(i).Age;
            System.out.printf("Sinh vien %s, %d tuoi\n", fName,tuoi);
        }
    }

     public static void Add(List<Student> listStudent, int n){
        for(int i = 0; i<n; i++)
        {
            Student std = new Student();
            std.nhapthongtin();
            listStudent.add(std);
        }
    }

     public static void Update(List<Student> listStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon cap nhat :");
        String ten= sc.nextLine();
        for(int i=0; i<listStudent.size(); i++){
            if(listStudent.get(i).FullName.equals(ten)){
                Student std = new Student();
                std.nhapthongtin();
                listStudent.set(i, std);
            }
        }
    }
    
    public static void Delete(List<Student> listStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon xoa :");
        String ten= sc.nextLine();
        for(int i=0; i<listStudent.size(); i++){
            if(listStudent.get(i).FullName.equals(ten)){
                Student std = new Student();
                std.nhapthongtin();
                listStudent.remove(i);
            }
        }
    }
}

