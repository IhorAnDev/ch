package Work.Algoritms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> mass = new ArrayList<>();
        mass.add("AAA");
        mass.add("BBB");
        mass.add("CCC");
        mass.add("DDD");

//        System.out.println(linearSearch(mass, "BBB"));
        int[] intMass = {10, 23, 124, 56, 1, 5, 15};
        bubbleSort(intMass);
        for (int i : intMass) {
            System.out.println(i);
        }

    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    private static int linearSearch(List<String> list, String arg) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(arg)) {
                return i;
            }
        }
        return -1;
    }
}