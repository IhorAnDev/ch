package Work.Structure;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

        int[] mass = new int[]{7, 2, 4, 6, 8, 3};

        fillCollections(arrayList, mass);
        fillCollections(linkedList, mass);
        fillCollections(hashSet, mass);
        fillCollections(treeSet, mass);

        System.out.println("ArrayList");
        printCollection(arrayList);
        System.out.println("\nLinkedList");
        printCollection(linkedList);
        System.out.println("\nHashSet");
        printCollection(hashSet);
        System.out.println("\nTreeSSet");
        printCollection(treeSet);
    }

    private static void printCollection(Collection<Integer> collection) {

        for (Integer el : collection) {
            System.out.print(el+ ", ");
        }

    }


    private static void fillCollections(Collection<Integer> collection, int[] mass) {
        for (int el : mass) {
            collection.add(el);
        }
    }
}
