package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfacesExmpl2 {
    public static void main(String[] args) {

        //Example 1

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1: "+list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List 2: "+list2);

        //Example2

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        for(int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i)+" ");
        }
        System.out.println();
        for(String str: arrayList){
            System.out.println(str + " ");
        }
        System.out.println();

        //LinkedList

        LinkedList<String> car= new LinkedList<>();
        car.add("BMW");
        car.add("Porche");
        car.add("Toyota");
        System.out.println(car);
        System.out.println(car.getLast());
        System.out.println(car.getFirst());

        LinkedList<Integer> listInt = new LinkedList<>();
        for(int i = 0; i<=100; i++){
            listInt.add(i);
        }
        System.out.println(listInt);


    }
}
