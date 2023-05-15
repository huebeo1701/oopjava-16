import java.util.LinkedList;

public class Slide38 {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("----------------------");

        LinkedList<String> listA = new LinkedList<
        String>();
        listA.addAll(list);
        System.out.println("listA");
        showList(listA);
        System.out.println("\nVi du su dung phuong thuc retainAll()");
        System.out.println("------------------------");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");

        listA.retainAll(listB);
        System.out.println("listA");
        showList(listA);
        System.out.println("\nvi du su dung phuong thu removeAll()");
        System.out.println("-----------------------");

        list.removeAll(listB);
        System.out.println("list :");
        showList(list);
    }
    public static void showList(LindedList<String> list){
        for(String obj : list){
            System.out.println("\t" + obj + ",");
        }
        System.out.println();
    }
}

