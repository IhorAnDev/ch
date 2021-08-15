package Work.Lesson2;

import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] massive = new int[12];

        for (int i = 0; i < 5; i++) {
            int result = i + 1;
            massive[i] = result;
            System.out.println("Element with index " + i + " budet so znacheniem " + result);
        }
    }
}
