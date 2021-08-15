package Work.Lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        Scanner inputFromLine = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        String str = "Hey Bro";
        System.out.println(str.startsWith("H"));

        System.out.println("enter 1 number");
        firstNumber = inputFromLine.nextInt();

        System.out.println("enter 2 number");
        secondNumber = inputFromLine.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Bolshe " + firstNumber);
        }else {
            System.out.println("Menshe" + secondNumber);
        }

    }
}
