package Obj;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class StudentHashSet {
    public String FullName;
    public int Age;

     public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        FullName= sc.nextLine();
        System.out.println("Nhap tuoi : ");
        Age = sc.nextInt();
    }

     public static void Display(Set<StudentHashSet> setStudent){
        for(StudentHashSet std : setStudent){
            String fName = std.FullName;
            int tuoi = std.Age;
            System.out.printf("Sinh vien %s, %d tuoi \n", fName, tuoi);
            }
        }

     public static void Add(Set<StudentHashSet> setStudent, int n){
        for(int i = 0; i<n; i++)
        {
            StudentHashSet std = new StudentHashSet();
            std.nhapthongtin();
            setStudent.add(std);
        }
    }

     public static void Update(Set<StudentHashSet> setStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon cap nhat :");
        String ten= sc.nextLine();
        for(StudentHashSet std : setStudent){
            if(std.FullName.equals(ten)){
                std.nhapthongtin();
            }
        }
    }
    
    public static void Delete(Set<StudentHashSet> setStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thong tin muon xoa :");
        String ten= sc.nextLine();
        Set<StudentHashSet> temp = new HashSet<StudentHashSet>();
            for(StudentHashSet std : setStudent){
                if(!std.FullName.equals(ten)){
                    temp.add(std);
            }
        }
        setStudent.clear();
        setStudent.addAll(temp);
    }
}
