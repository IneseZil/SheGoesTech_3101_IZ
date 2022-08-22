package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfaceExmpl {
    public static void main(String[] args) {

        //HashSet
        HashSet<String> name = new HashSet<>();
        name.add("Inese");
        name.add("Guntars");
        name.add("Alise");
        name.add("Renars");

        //Print all  - order gets ignored
        System.out.println(name);

        //Remove
        name.remove("Guntars");
        System.out.println(name);

        //Size
        System.out.println(name.size());

        //Contains
        System.out.println(name.contains("INESE"));
        System.out.println();
        name.add("Guntars");

        //Iterate through elements
        for(String str:name){
            System.out.println(str);
        }
        System.out.println();

        //Iterator
        Iterator<String> i = name.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();

        //HashSet Example2

        HashSet<Integer> intSet1 = new HashSet<Integer>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("insSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<Integer>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2: " + intSet2);

        //Find union
        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union "+union);
        union.addAll(intSet2);
        System.out.println("Union all: "+union);

        //Find intersection
        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("Intersection: "+ intersection);

        //Find difference
        HashSet<Integer> difference = new HashSet<>(intSet2);
        difference.removeAll(intSet1);
        System.out.println("Difference: "+difference);

        //Linked HashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Spain");
        linkedHashSet.add("Estonia");

        System.out.println(linkedHashSet);

        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);


    }
}
