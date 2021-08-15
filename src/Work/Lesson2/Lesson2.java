package Work.Lesson2;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {

        Scanner inputFromLine = new Scanner(System.in);

        int first;
        int second;

        System.out.println("entered first number");
        first = inputFromLine.nextInt();

        System.out.println("entered second numper");
        second = inputFromLine.nextInt();

        System.out.println(sum(first, second) + " Summa");

    }

    public static int sum(int firstn, int secondn) {

        return firstn + secondn;
    }

}

