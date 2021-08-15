package Work.Wrappers;

public class Main {
    public static void main(String[] args) {

        Integer firstNumber = new Integer(10);
        Integer secondNumber = new Integer(10);

        int a = 15;
        int b = 15;

        System.out.println(a == b);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber.equals(secondNumber));
    }
}
